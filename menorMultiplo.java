import java.util.Scanner;

public class menorMultiplo {
    public static void main(String[] args) {
        
    /*Dado um inteiro positivo n , retorne o menor inteiro 
    positivo que é um múltiplo 2 de e n . 
    A entrada consiste em um int, 
    do qual podemos calcular seu menor multiplo.
    A saida consiste em um retorno, 
    que será o menor multiplo digitado e 2.*/

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    int numero = scan.nextInt();

    int minimoMultiplo = 0;
    
    if (numero % 2 == 0) {
      minimoMultiplo = numero;
    } else {
      minimoMultiplo = numero * 2;
    }

    System.out.println("O resultado é:" + minimoMultiplo);
  
        
    }
}
