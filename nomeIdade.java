import java.util.Locale;
import java.util.Scanner;

//criar lista de alunos com nome e idade que se encerra com o termo zero

public class nomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
                
       while(true) {
        System.out.println("Nome do aluno: ");
        String nome = scanner.next();
        if (nome.equals("0")) break;

        System.out.println("Idade: ");
        int idade = scanner.nextInt();

    }
    System.out.println("Lista finalizada com sucesso");
}}
