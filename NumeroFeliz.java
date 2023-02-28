import java.util.Scanner;
import java.util.Spliterators;

public class NumeroFeliz {
    public static void main(String[] args) throws Exception {

/*
 Um número feliz é um número definido pelo seguinte processo:

• Começando com qualquer número inteiro positivo, 
substitua o número pela soma dos quadrados de seus dígitos.
• Repita o processo até que o número seja igual a 1 (onde ficará), 
ou faça um loop infinito em um ciclo que não inclua 1.
• Aqueles números para os quais esse processo termina em 1 são felizes.
• Retorna true se for um número feliz e false se não for.


 */
        

 Scanner scan = new Scanner(System.in);
 
 System.out.println("Digite um número: ");
 int numero = scan.nextInt();

int somaNovoNumero = 0;
int i = 0;

do{

int digit = numero % 10; //pega o segundo digito
int digitoQuadrado = digit * digit; 
int digitoQuadrado3 = 0;
numero /= 10; //pega o primeiro digito
    if(numero > 9) {
        digit = numero % 10; //pega o segundo digito
        digitoQuadrado3 = digit * digit;

        numero /= 10;
        
        }

int digitoQuadrado2 = numero * numero;
somaNovoNumero = digitoQuadrado + digitoQuadrado2 + digitoQuadrado3;

    //System.out.println("Dígitos ao quadrado: " +digitoQuadrado + "+" + digitoQuadrado3 + "+" + digitoQuadrado2);
    

numero = somaNovoNumero;
 i++;
        System.out.println("Loop: " + i);
        System.out.println("Novo número: " + somaNovoNumero);

}while(i < 10 );

if(somaNovoNumero == 1) System.out.println("true");
else System.out.println("false");


    }
}
