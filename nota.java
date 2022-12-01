import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
       /*Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo
até que o usuário informe um valor válido. */
    
        Scanner scanner = new Scanner(System.in);
       

        System.out.println("Nota: ");
            int nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scanner.nextInt();
    }
    
    }
}
