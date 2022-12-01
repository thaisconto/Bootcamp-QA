import java.util.Scanner;

public class maiorEMedia {
    public static void main(String[] args) {
        /*Faça um programa que leia 5 números
e informe o maior número e a média desses números. */
        
        Scanner scan = new Scanner(System.in);
     
        //criar variavel para saber quantos numeros foram pedidos
        //colocar no while a quantidade de contator que deve parar o loop
        int contador = 0;
        
        //criar variavel para o maior numero e colocar dentro do if
        int maior = 0;
        
        //criar variavel soma
        int soma= 0;

        do{
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();
            contador = contador + 1;

            soma = soma + numero;
            
            //se o numero for maior que a variavel maior, entao a variavel maior se torna o mesmo valor do numero
            if (numero > maior) maior = numero;
        
        } while(contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma/5));

    }   
}
