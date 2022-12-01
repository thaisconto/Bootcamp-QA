public class ordem {
    public static void main(String[] args) {
        
        /*Crie um vetor de 6 numeros inteiros e
         * mostre-os na ordem inversa.*/

         int[] vetor = {0, 1, 2, 3, 4, 5};
         
         int contador = 0;

         System.out.print("Vetor: ");
         //length retorna o tamanho-quantos elementos cabem no meu array
         while(contador < (vetor.length)) {
            System.out.print(vetor[contador] + " ");
            contador++;

         }

         System.out.print("\nVetor invertido: ");
         //imprimir da forma invertida
         for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");

         }


         

         

    }
}
