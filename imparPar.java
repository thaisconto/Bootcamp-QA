import java.util.Scanner;

public class imparPar {
    public static void main(String[] args) throws Exception {
        
        /*Faça um programa que peça N números inteiros,
        calcule e mostre a quantidade de números pares 
        e a quantidade de números impares. */
   Scanner scan = new Scanner(System.in);

   int quantidadeNumeros;
   
   System.out.println("Quantidade de número: ");
   quantidadeNumeros = scan.nextInt();

   int contador = 0;
   int numero;
   int quantidadePares =0;
   int quantidadeImpares=0;


   do{
    System.out.println("Número: ");
    numero = scan.nextInt();
    
    //se o numero divido por 2 der zero, é par. Se não, é impar.
    if (numero % 2 == 0 ) quantidadePares++;
    else quantidadeImpares++;
    
    contador++;



   }while(contador < quantidadeNumeros);
   
   System.out.println("Quantidade números pares: " + quantidadePares);
   System.out.println("Quantidade números ímpares: " + quantidadeImpares);
    
}
}
