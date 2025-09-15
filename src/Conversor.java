import java.util.Scanner;

public class Conversor {
    Scanner sc = new Scanner(System.in);

    double celsius;


    public void obterDados(){
        System.out.print("digite a temperatura em Celsius:");
          celsius = sc.nextDouble();

          calcularResultados();
    }

    public void calcularResultados(){
        System.out.println("Escolha uma das conversão:");

        System.out.println("1 - Celsius para Fahrenheit");

        System.out.println("2 - Celsius para Kelvin");

        System.out.println("Opção:");
          int opcao = sc.nextInt();


          switch (opcao){
              case 1:
                  double fahrenheit = (celsius * 1.8) + 32;

                        String temperatura = String.format("%.2f",fahrenheit);
                  System.out.println(celsius + "ºC equivale a " + fahrenheit + "ºF");
                  break;
          }

          switch (opcao){
              case 2:
                  double kelvin = celsius +  273.15;

                    String temperatura = String.format("%.2f",kelvin);
                  System.out.println(celsius + "ºC equivale a " + kelvin + "ºK");
                  break;
          }

        System.out.println("deseja saber outra temperatura 1/2");
          int desejo = sc.nextInt();

          switch (desejo){
              case 1:
                  obterDados();
                  break;
              case 2:
                  System.out.println("ok...");
          }
    }
}
