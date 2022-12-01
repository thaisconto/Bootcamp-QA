import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) throws Exception {
        
        /*Faça um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100)
         * Armazene-os em um vetor.
         * Ao final, mostre os números e seus sucessores
         */

         Random random = new Random();

         int[] numerosAleatorios = new int[20];

         for(int i = 0; i < numerosAleatorios.length; i++ ) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
         }

         System.out.println("Números aleatórios: ");

         for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
         }

         System.out.println("\n\nSucessores dos números aleatórios: ");

         for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
         }     
    }
}
