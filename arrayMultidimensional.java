import java.util.Random;

public class arrayMultidimensional {
    public static void main(String[] args) throws Exception {
        
/*Gere e imprima uma matriz de ordem 4x4.
 * Com valores aleatórios entre 0-9.
 */

 Random random = new Random();

 //[linha][coluna]
 int[][] matriz = new int[4][4];

 //fazer o percurso de linha a linha, passando por todas as colunas em cada linha
 for(int linha = 0; linha < matriz.length; linha++){
    for(int coluna = 0; coluna < matriz[linha].length; coluna++ ){
        //preencher a matriz com nueros aleatórios
        matriz[linha][coluna] = random.nextInt(9);
    }
 }

 for(int[] elementoDaLinha : matriz){
    for(int elementoDaColuna : elementoDaLinha){
        System.out.print(elementoDaColuna + " ");
    } 
    System.out.println();
 }

}
}
