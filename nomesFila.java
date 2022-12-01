import java.util.Scanner;

public class nomesFila {
    public static void main(String[] args){

    /*Elabore um programa que simule uma fila de atendimento bancário.
     O programa deve ler o nome de 3 pessoas (clientes do banco), 
     armazenando-os em uma fila. O programa deve imprimir como saída na tela 
     o nome da pessoa e sua posição na fila.*/

     Scanner scan = new Scanner(System.in); 
        
        
        int i = 1;

        do{
            System.out.println("Nome: ");
            String nome = scan.next();
            System.out.println(nome + " - esta na posicao: " + i);
            i++;

        } while (i < 4);
        


    }
}
