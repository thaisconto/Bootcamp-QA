import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) throws Exception {
        
        /*Faça um programa que leia um vetor de 6 caracteres, e
         * diga quantas consoantes foram lidas.
         * Imprima as consoantes.
         */

    Scanner scan = new Scanner(System.in);

    String[] consoantes = new String[6];
    int quantidadeConsoantes = 0;
    int contador = 0;

    do {
        System.out.println("Letra: ");
        String letra = scan.next();
//as consoantes são diferente sinal ! das vogais
        if( !(letra.equalsIgnoreCase("a")|
             letra.equalsIgnoreCase("e")|
             letra.equalsIgnoreCase("i")|
             letra.equalsIgnoreCase("o")|
             letra.equalsIgnoreCase("u"))) {
        consoantes[contador] = letra;
        quantidadeConsoantes++;
             }
        contador++;

    } while(contador < consoantes.length);
    
System.out.println("Consoantes: ");

for ( String consoante : consoantes ){
    //se não tirar o null, todas a vogais vão ser impresas como null;
    if ( consoante != null)
    System.out.println(consoante + " ");

}

    System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}
