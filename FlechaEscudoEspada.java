import java.util.Scanner;

public class FlechaEscudoEspada {

    /*
    Você e seus amigos estão em uma aula de criação de jogos. 
    Para inspirar os alunos e treinar, o professor pediu para que vocês fizessem 
    um jogo que já existe com alguma modificação. 
    A escolha de vocês foi "Pedra, Papel e Tesoura" e a modificação foi mudar 
    Pedra para Flecha, Papel para Escudo e Tesoura para Espada.
    Então, vocês escolheram um número para representar cada um dos parâmetros. Sendo:
    1 - Flecha // 2 - Escudo // 3 - Espada
    A entrada vão ser dois números representando cada um dos parâmetros. 
    Sendo a primeira entrada o jogador e a segunda o inimigo.
    A saída deve ser se o jogador ganhou, empatou ou perdeu após a análise das duas entradas. 
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);  

              
        System.out.println("Jogador: ");
        int jogadaJogador = leitor.nextInt();
        
        System.out.println("Inimigo: ");
        int jogadaInimigo = leitor.nextInt();
        
        //1 - pedra // 2 - papel // 3 - tesoura
        //Possibilidade: 11,12,13,21,22,23,31,32,33
        if (jogadaJogador == jogadaInimigo) System.out.println("Empatou");
        if (jogadaJogador == 1 & jogadaInimigo == 2) System.out.println("Perdeu");
        if (jogadaJogador == 1 & jogadaInimigo == 3) System.out.println("Ganhou");
        if (jogadaJogador == 2 & jogadaInimigo == 1) System.out.println("Ganhou");
        if (jogadaJogador == 2 & jogadaInimigo == 3) System.out.println("Perdeu");
        if (jogadaJogador == 3 & jogadaInimigo == 1) System.out.println("Perdeu");
        if (jogadaJogador == 3 & jogadaInimigo == 2) System.out.println("Ganhou");

            
    }
}
