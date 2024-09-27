/*
Faça um programa que receba de entrada a data de votação do ano atual e a data de nascimento de uma pessoa. Utilizando as informações pesquisadas na questão anterior, verifique se essa pessoa não pode votar, é obrigada a votar ou o voto é facultativo, segundo as regras brasileiras.

  Idade Voto
  Menor de 16 Não vota
  16 à 18 e acima de 70 Facultativo
  Entre 18 e 70 Obrigatório

Obs.: Na leitura dos dados, você pode receber separadamente as informações do dia, mês e ano de cada data ou receber os dados em uma única string e fazer a separação das informações utilizando a função da classe split da classe String.
  */

import java.util.Scanner;

public class Gustavo11{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe o dia, mês e ano de nascimento(dd/mm/aaaa): ");
    String Nascimento = teclado.next();
    String[] DataNascimento = Nascimento.split("/");
    int dia = Integer.parseInt(DataNascimento[0]);
    int mes = Integer.parseInt(DataNascimento[1]);
    int ano = Integer.parseInt(DataNascimento[2]);
    
    
    System.out.println("Diga o dia, mês e ano da próxima votação: ");
    String Vota = teclado.next();
    String[] DataVoto = Vota.split("/");
    int diaV = Integer.parseInt(DataVoto[0]);
    int mesV = Integer.parseInt(DataVoto[1]);
    int anoV = Integer.parseInt(DataVoto[2]);
    
    int Idade = anoV - ano;
    int Idade2 = mesV-mes;
    int Idade3 = diaV-dia;
    
    if (Idade < 16){
      System.out.println("Pode votar n man");
    }
    if ((Idade >= 16 && Idade < 18) || Idade > 70){
      if (Idade > 70){
        System.out.println("Voto facultativo");
      }
      if(Idade == 16){
        if (Idade2 < 0){
          System.out.println("Pode votar n man (mes)");
        }
        else if(Idade2 == 0){
          if (Idade3 <= 0){
            System.out.println("Pode votar n man2");
          }
          else{
            System.out.println("Voto facultativo");
          }
        }
        else{
          System.out.println("Voto facultativo");
        }
      }
    }
    if (Idade >= 18 && Idade <= 70){
      System.out.println("Voto obrigatório");
    }
  }
}
