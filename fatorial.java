import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) throws Exception {
        /*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1) */
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");

        for (int contador = fatorial; contador >= 1; contador--) {
            multiplicacao = multiplicacao*contador;
            
        }

        System.out.println(multiplicacao);
    }
}
