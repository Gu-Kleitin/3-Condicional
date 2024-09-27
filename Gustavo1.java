import java.util.Scanner;

public class Gustavo1{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual é a sua idade? ");
    int idade = teclado.nextInt();

    if (idade <= 5){
      System.out.println("Muito novo criança, não pode participar");
    }
      else if(idade >=6 && idade <= 9){
        System.out.println("Categoria fraldinha");
      }
      else if(idade >= 10 && idade <=15){
        System.out.println("Categoria infantil");
      }
      else if(idade >= 16 && idade < 18){
        System.out.println("Juvenil");
      }
      else if(idade >= 18 && idade <= 40){
        System.out.println("Adulto");
      }
      else{
          System.out.println("Senior");
        }
  }
}