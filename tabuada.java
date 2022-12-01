import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        
/* Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

Scanner scan = new Scanner(System.in);

System.out.println("Tabuada: ");
int tabuada = scan.nextInt();

System.out.println("Tabuade de " + tabuada);

//sintaxe for( ; ; ){}
for( int contador = 1; contador <= 10; contador++){

    System.out.println(tabuada + "  X  " + contador + "  =  " + (tabuada*contador));


}
    }
}
