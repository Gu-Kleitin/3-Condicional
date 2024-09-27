import java.util.Scanner;

public class Gustavo3{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quanto custou para fabricar o carro? ");
    double Custo = teclado.nextDouble();

    if (Custo <= 2800.00){
      double CustoF = Custo+(Custo*0.05);
      System.out.format("O custo do carro para o consumidor será de: %.2f \n", CustoF);
    }
      else if (Custo >= 2800.01 && Custo <= 45000.00){
        double CustoF = Custo+((Custo*0.1)+(Custo*0.15));
        System.out.format("O custo do carro para o consumidor será de: %.2f \n", CustoF);
      }
    else{
      double CustoF = Custo+((Custo*0.15)+(Custo*0.2));
      System.out.format("O custo do carro para o consumidor será de: %.2f \n", CustoF);
    }
  }
}