/*
O número de inscrição no CPF é composto de onze dígitos decimais, sendo os oito primeiros aleatoriamente designados no momento da inscrição. Já o nono (antepenúltimo) dígito indica a região fiscal responsável pela inscrição (MG é a região 6, portanto em todos CPF’s emitidos em MG o nono digito é 6).
Por fim, o décimo e o décimo primeiro são dígitos verificadores calculados de acordo com um algoritmo definido pela Receita Federal e publicamente conhecido. Assim sendo, seja 'D os nove primeiros dígitos de um número de CPF qualquer visitado da direita para a esquerda, na forma:
D = (d0, d1, d2, d3, d4, d5, d6, d7, d8)'', onde di representa o dígito do CPF na posição i e d0 representa a posição mais a direita deste CPF. Ou seja, os dígitos do CPF 123456789 são representados por D = (9, 8, 7, 6, 5, 4, 3, 2, 1).
  Assim, implemente um algoritmo que receba de entrada o valor dos 9 primeiros dígitos de um CPF (uma única variável inteira), e dos 2 dígitos verificadores. Desmembre os 9 dígitos do CPF utilizando as operações de divisão e resto da divisão inteira. Faça os cálculos, de acordo com a expressão acima, para verificar se os dígitos verificadores do CPF digitado são válidos. Como exemplo, utilizem o valor inicial dos CPF 111444777, os dígitos verificadores devem ser v1 = 3 e v2 = 5. Ou utilizem o próprio CPF como
exemplo.
  */

import java.util.Scanner;

public class Gustavo18{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);

    //Como eu poderia colocar uma máscara quando o usuário digita o cpf?
    System.out.println("digite os 9 primeiros digitos do seu cpf sem espaços(111111111): ");
    int D = teclado.nextInt();//variavel inteira
    
    System.out.println("Informe o 10° digito do seu cpf");
    int v1 = teclado.nextInt();
    System.out.println("Informe o 11° digito do seu cpf");
    int v2 = teclado.nextInt();

    int [] digitos = new int[9];
    for (int i = 0; i <9; i++){
      digitos[i] = D % 10;
      D /= 10;
    }
    
    int Digito10 = VerificadorDeDigitos(digitos);

    int[] ListaDigitos = new int[10];
    for (int i = 0; i < 9; i++){
      ListaDigitos[i] = digitos[i];
    }
    ListaDigitos[9] = Digito10;
    
    int Digito11 = VerificadorDeDigitos2(ListaDigitos);

    //tive que fazer essa inversão, pq inverti os numeros do cpf na lista digitos, mas não consegui pegar os digitos v1 e v2 e colocar lá invertidos, em cpfs que os ultimos digitos são iguais não teria problema deixar do jeito q estava, mas quando os números são diferentes, precisa dessa inversão, se você souber como eu posso concertar isso me diga depois por favor
    
    if(Digito10 == v2 && Digito11 == v1){
      System.out.format("Os dígitos verificadores %d e %d estão corretos\n", v1, v2);
    }
    else{
      System.out.format("Um dos dígitos verificadores %d e %d estão errados\n", v1, v2);
    }
  }
  public static int VerificadorDeDigitos(int[] digitos) {
    int somatorio = 0; 
    for (int i = 0; i < 9; i++) {
      somatorio += digitos[i] * (10 - i); 
    }   
    int resto = 11-(somatorio % 11);
    return (resto >= 10 )? 0 : resto;
  }
  public static int VerificadorDeDigitos2(int[] digitos) {
    int somatorio = 0; 
    for (int i = 0; i < 10; i++) {
      somatorio += digitos[i] * (11 - i); 
    }   
    int resto = 11-(somatorio % 11);
    return (resto >= 10)? 0 :  resto;
  }
}