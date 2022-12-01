import java.util.Scanner;

public class mediaEIdade {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        /*Faça um programa que peça para 3 pessoas a sua idade, 
        ao final o programa deverá verificar se a média de idade 
        da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, 
        dizer se a turma é jovem, adulta ou idosa, conforme a média 
        calculada.*/
       
         System.out.println("Digite a idade: ");
         int idade1 = leitor.nextInt();
         System.out.println("Digite a idade: ");
         int idade2 = leitor.nextInt();
         System.out.println("Digite a idade: ");
         int idade3 = leitor.nextInt();

         int mediaIdade = ((idade1 + idade2 + idade3)/3);
         
        if(mediaIdade <= 25) System.out.println("Jovem!");
        else if (mediaIdade <=60)System.out.println("Adulta!");
        else System.out.println("Idosa!");
        
    

    }
}
