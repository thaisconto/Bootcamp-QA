import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 Crie um conjunto e adicione as notas: utilizando LIST
Exiba a posição da nota 5.0
Adicione na lista a nota 8.0 na posição 4
Substitua a nota 5.0 pela nota 6.0
Confira se a nota 5.0 está no conjunto
Exiba a terceira nota adicionada:
Exiba a menor nota
Exiba a maior nota
Exiba a soma dos valores
Exiba a média dos valores
Remova a nota 0.0
Remova a nota da posição 0
Remova as notas menores que 7 e exiba a lista
Exiba todas as notas na ordem crescente
Apague todo o conjunto
Confira se a lista está vazia
 */

public class criarListas {
    public static void main(String[] args) {
        
        //criar lista com 7 notas (7d, 8.5, 9.3, 5d, 7d, 0d, 3.6) de alunos.
       
        List<Double> notas = new ArrayList<>();
                
        //outra forma: dessa forma a lista é imutável
        // List<Double> notas = new ArrayList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        
        notas.add(7d);  
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        //notas.remove(5d); 


        //System.out.println("notas" + notas);
        //ou: 
        for (Double nota : notas) System.out.println(nota);
        //System.out.println(notas.toString());

        System.out.println("\nPosição nota 5.0: " + notas.indexOf(5d));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: " );
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        // se é terceira nota, está na posição 2
        System.out.println(notas);

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        
        java.util.Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        

        System.out.println("\nExiba a média das notas: "+ (soma/notas.size()));

        System.out.println("\nRemova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que sete: ");
        java.util.Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());
            
    } 
}
