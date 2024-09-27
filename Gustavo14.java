/*
O Brasil é composto por 26 Estados e um Distrito Federal (onde se encontra a capital do país). Para que\nseja possível a realização de chamadas telefônicas interurbanas tem-se o DDD (Discagem Direta à\nDistância). O DDD é um código utilizado para identificar as áreas de registro de telefonia no Brasil,\npermitindo realizar ligações interurbanas sem a necessidade de uma operadora. A seguir você poderá ver a\nlista com todas estas unidades federativas e todos os códigos DDD do Brasil que são agrupados por região\ngeográfica. Assim sendo, implemente um algoritmo que dado um DDD exiba a qual estado ele pertence.
 */

import java.util.Scanner;
public class Gustavo14{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      int DDD;

      System.out.print("Digite o seu DDD: ");
      DDD = teclado.nextInt();

      switch(DDD){
         case 68:
            System.out.println("O seu DDD pertence ao estado Acre.");
            break;
         case 82:
            System.out.println("O seu DDD pertence ao estado Alagoas.");
            break;
         case 96:
            System.out.println("O seu DDD pertence ao estado Amapá.");
            break;
         case 92:
            System.out.println("O seu DDD pertence ao estado Amazonas.");
            break;
         case 97:
            System.out.println("O seu DDD pertence ao estado Amazonas.");
            break;
         case 71:
            System.out.println("O seu DDD pertence ao estado Bahia.");
            break;
         case 73:
            System.out.println("O seu DDD pertence ao estado Bahia.");
            break;
         case 74:
            System.out.println("O seu DDD pertence ao estado Bahia.");
            break;
         case 75:
            System.out.println("O seu DDD pertence ao estado Bahia.");
            break;
         case 77:
            System.out.println("O seu DDD pertence ao estado Bahia.");
            break;
         case 85:
         case 88:
            System.out.println("O seu DDD pertence ao estado Ceará.");
            break;
         case 61:
            System.out.println("O seu DDD pertence ao Distrito Federal.");
            break;
         case 27:
               System.out.println("O seu DDD pertence ao estado Espírito Santo.");
               break;
         case 28:
               System.out.println("O seu DDD pertence ao estado Espírito Santo.");
               break;
         case 62:
            System.out.println("O seu DDD pertence ao estado Goiás.");
            break;
         case 64:
            System.out.println("O seu DDD pertence ao estado Goiás.");
            break;
         case 98:
         case 99:
               System.out.println("O seu DDD pertence ao estado Maranhão.");
               break;
         case 65:
         case 66:
            System.out.println("O seu DDD pertence ao estado Mato Grosso.");
            break;
         case 67:
            System.out.println("O seu DDD pertence ao estado Mato Grosso do Sul.");
            break;
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 37:
         case 38:
               System.out.println("O seu DDD pertence ao estado Minas Gerais.");
               break;
         case 91:
            System.out.println("O seu DDD pertence ao estado Pará");
            break;
         case 83:
            System.out.println("O seu DDD pertence ao estado Paraíba");
            break;
         case 41: 
         case 42:
         case 43:
         case 44:
         case 45: 
         case 46:
            System.out.println("O seu DDD pertence ao estado Paraná.");
            break;
         case 81:
         case 87:
            System.out.println("O seu DDD pertence ao estado Pernambuco.");
            break;
         case 86:
         case 89:
            System.out.println("O seu DDD pertence ao estado Piauí.");
            break;
         case 21:
         case 22:
         case 24:
            System.out.println("O seu DDD pertence ao estado Rio de Janeiro.");
            break;
         case 84:
            System.out.println("O seu DDD pertence ao estado Rio Grande do Norte.");
            break;
         case 51:
         case 53:
         case 54:
         case 55:
            System.out.println("O seu DDD pertence ao estado Rio Grande do Sul");
            break;
         case 69:
            System.out.println("O seu DDD pertence ao estado Rondônia.");
            break;
         case 95:
            System.out.println("O seu DDD pertence ao estado Roraima.");
            break;
         case 47:
         case 48: 
         case 49:
            System.out.println("O seu DDD pertence ao estado Santa Catarina.");
            break;
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
            System.out.println("O seu DDD pertence ao estado São Paulo.");
            break;
         case 79:
            System.out.println("O seu DDD pertence ao estado Sergipe.");
            break;
         case 63:
            System.out.println("O seu DDD pertence ao estado Tocantins.");
            break;   
         default:
            System.out.println("DDD invalido  fera.");
      }
   }
}