import java.util.Scanner;

public class QuantidadeNecessaria {
    public static void main(String[] args) throws Exception {
 /*
 Cada pizza é composta por 4 fatias. 
Há N amigos e cada amigo precisa de exatamente X fatias.
Você deverá criar um código capaz de calcular o número mínimo de pizzas 
que eles devem pedir para satisfazer seu apetite.

Entrada: A primeira linha de entrada conterá um único inteiro T, 
indicando o número de casos de teste.
Cada caso de teste consiste em dois inteiros. 
N para o número de amigos e X para a quantidade de fatia que cada 
amigo deseja.

Saída: Para cada caso de teste, produza o número mínimo de pizzas 
necessário, conforme o exemplo a baixo:

Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar 1 pizza, 
ele receberá apenas 4 fatias. Assim, pelo menos 2 pizzas devem ser 
encomendadas para ter o número necessário de fatias.
*/      
        

        final int SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantidade amigos:");
    int numeroDeTeste = scanner.nextInt();
    int i = 1;
    int quantidadeFatiasTotal = 0;

    do {System.out.println("Quantidade fatias desejadas:");
    int quantidadeFatia = scanner.nextInt();
    quantidadeFatiasTotal = quantidadeFatiasTotal + quantidadeFatia;
    i++;

    } while (i <= numeroDeTeste);

    
    
    double divisaoFatiasPorPizza = quantidadeFatiasTotal / 4d + (0.5d);

    System.out.println("Fatias total: " + quantidadeFatiasTotal);
    System.out.println("Pizzas necessárias: " + Math.round(divisaoFatiasPorPizza));

    }
}
