import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie um conjunto e adicione as notas: utilizando HASHSET
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
Confira se a lista está vazia:
 */

public class App {
    public static void main(String[] args) {
        
System.out.println("Crie um conjunto e adicione as notas: ");
Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
System.out.println(notas.toString());
//note que o elemento repetido, só aparece uma vez
//porque hashSet não aceita elementos repetidos
//também não é posivel se trabalhar com as posições/substituição dentro da hashSet

System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

System.out.println("Exiba a menor nota: " + java.util.Collections.min(notas));

System.out.println("Exiba a maior nota: " + java.util.Collections.max(notas));

System.out.println("Exiba a soma dos valores: ");
Iterator<Double> iterator = notas.iterator();
Double soma = 0.0;
while(iterator.hasNext()){
    Double next = iterator.next();
    soma += next;
}
System.out.println(soma);

System.out.println("Exiba a média dos valores: "+ (soma/ notas.size()));

System.out.println("Remova a nota 0.0: " );
notas.remove(0d);
System.out.print(notas);

System.out.println("Remova as notas menores que 7 e exiba a lista: ");
Iterator<Double> iterator1 = notas.iterator();
while(iterator1.hasNext()){
    Double next = iterator1.next();
    if (next < 7) iterator1.remove();
}
System.out.println(notas);

//para exibir a ordem, precisa usar o linkedHashSet
Set<Double> notasLinkedSet = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
//System.out.println(notasLinkedSet.toString());
Set<Double> notas3 = new TreeSet<>(notasLinkedSet);
//com o linked set não precisa usar o comparator
System.out.println(notas3);

System.out.println("Apague todo o conjunto: ");
notas.clear();
System.out.print(notas);


System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());

    }
}

