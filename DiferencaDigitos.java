import java.util.Arrays;
import java.util.Scanner;

public class DiferencaDigitos {
    public static void main(String[] args) throws Exception {

/*
 O desafio consiste em um número inteiro n, 
 onde será necessário calcular a diferença entre o produto e a soma 
 dos seus digitos.
 Exemplo: n = 234
 Produto de dígitos = 2 * 3 * 4 = 24
 Soma dos dígitos = 2 + 3 + 4 = 9
 Resultado = 24 - 9 = 15
 */

Scanner scan = new Scanner(System.in);
 
System.out.println("Digite um número: ");
    int numero = scan.nextInt();

//transformando o número em string
String numeroEmString = String.valueOf(numero);
//prgando cada digito (split) e colocando em um array
String[] split = numeroEmString.split("");
//mapeando cada item do array (ints)
int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();  

int produto = 1;
int soma = 0;
int resultado = 0;

if (numero != 0){
    for(int i =0; i < ints.length; i++){
        produto = produto * ints[i];
        soma = soma + ints[i];
        resultado = produto - soma;
    }
    System.out.println("produto: " + produto);
    System.out.println("soma: " + soma);
    System.out.println("resultado: " + resultado);
    
}

}
}
