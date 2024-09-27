/*
21. Faça um algoritmo que receba o salário base e o tempo de serviço de um funcionário. Calcule e mostre (1) O imposto, conforme tabela:

SALÁRIO BASE

< R$ 200,00
Entre R$ 200,00 (inclusive) e R$ 450,00 (inclusive)
Entre R$ 450,00 e R$ 700,00
>= R$ 700,00

% SOBRE O SALÁRIO BASE Isento

3% 
8%
12%

(ii) A gratificação, conforme tabela:

SALÁRIO BASE
Superior a R$ 500,00
Até R$ 500,00

TEMPO DE SERVIÇO
Até 3 anos
Mais de 3 anos

Até 3 anos
Entre 3 e 6 anos
De 6 anos para cima

GRATIFICAÇÃO
20%
30%
23%
35%
33%

(iii) O salário líquido, ou seja, salário base menos imposto mais gratificação

(iv) A categoria que está na tabela a seguir.

SALÁRIO LÍQUIDO
Até R$ 350,00
Entre R$ 350,00 e R$ 600,00
De R$ 600,00 para cima

CLASSIFICAÇÃO
A
B
C
*/
import java.util.Scanner;

public class Gustavo21 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu salário base: R$ ");
        double salarioBase = teclado.nextDouble();

        System.out.print("Digite o seu tempo de serviço (em anos): ");
        int tempoServico = teclado.nextInt();

        double imposto = 0;
        
        if (salarioBase < 200) {
            imposto = 0;
        }
        else if (salarioBase >= 200 && salarioBase <= 450) {
            imposto = salarioBase * 0.03;
        }
        else if (salarioBase > 450 && salarioBase <= 700) {
            imposto = salarioBase * 0.08;
        }
        else {
            imposto = salarioBase * 0.12;
        }

        double gratificacao = 0;
        if (salarioBase > 500) {
            if (tempoServico <= 3) {
                gratificacao = salarioBase * 0.20;
            }
            else{
                gratificacao = salarioBase * 0.30;
            }
        }
        else {
            if (tempoServico <= 3) {
                gratificacao = salarioBase * 0.23;
            }
            else if (tempoServico > 3 && tempoServico <= 6) {
                gratificacao = salarioBase * 0.35;
            }
            else {
                gratificacao = salarioBase * 0.33;
            }
        }

        double salarioLiquido = salarioBase - imposto + gratificacao;

        String categoria = "";
        if (salarioLiquido <= 350) {
            categoria = "A";
        }
        else if (salarioLiquido > 350 && salarioLiquido <= 600) {
            categoria = "B";
        } 
        else {
            categoria = "C";
        }

        System.out.println("\n--- Resultados ---");
        System.out.format("Salário Base: R$ %.2f\n", salarioBase);
        System.out.format("Imposto: R$ %.2f\n", imposto);
        System.out.format("Gratificação: R$ %.2f\n", gratificacao);
        System.out.format("Salário Líquido: R$ %.2f\n", salarioLiquido);
        System.out.println("Categoria: " + categoria);
    }
}