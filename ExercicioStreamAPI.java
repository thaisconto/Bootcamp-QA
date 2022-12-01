import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExercicioStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");


       System.out.println("Imprima todos os elementos dessa lista de String: ");
/*---Forma extensa:
       numerosAleatorios.stream().forEach(new Consumer<String>() {
                @Override
                public void accept(String s){
                System.out.println(s);
        } 
        });     
        
---Forma com lambda:
        numerosAleatorios.stream().forEach(s -> System.out.println(s));

---Forma com reference method: */
        numerosAleatorios.forEach(System.out::println);
//___________________________________________     
  
       System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set:");

       numerosAleatorios.stream()
               .limit(5)
               .collect(Collectors.toSet())
               .forEach(System.out::println);
//__________________________________________

       System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
        
 /*---Forma extensa:  
        numerosAleatorios.stream()
        .map(new Function<String,Integer>() {
                @Override
                public Integer apply(String s){
                        return Integer.parseInt(s);
                }
                });
   ---Lambda:
        numerosAleatorios.stream()
        .map(s -> Integer.parseInt(s));
   ---Reference method: */
   
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
        
 
                
//________________________________________________

        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");
        
 /* Forma extensa:
                List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>(){
                        @Override
                        public boolean test(Integer i){
                                if(i % 2 == 0 && i > 2) return true;
                                return false;
                        }
                })
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);
                
Forma lambda: */
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

//______________________________________________________

        System.out.println("\nMostre a média dos números: ");

/* Forma extensa:
                numerosAleatorios.stream()
                .mapToInt(new ToIntFunction<T>() {
                        @Override
                        public int apllyAsList(String s){
                                return Integer.parseInt(s);
                        }
                        })

Forma lambda:
                numerosAleatorios.stream()
                .mapToInt(s -> Integer.parseInt(s));

forma reference method: 
                numerosAleatorios1.stream()
                .mapToInt(Integer::parseInt);

Cálculo da média extenso:
                numerosAleatorios1.stream()
                .mapToInt(Integer::parseInt);
                .average() OptionalDouble
               .ifPresent(new DoubleConsumer(){
                @Override
                public void accept(double v){
                        System.out.println(v);
                }
               });

Cálculo da média lambda:
               numerosAleatorios1.stream()
                .mapToInt(Integer::parseInt);
                .average() OptionalDouble
               .ifPresent(v -> System.out.println(v));

*/
                numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
                
//_________________________________________________      

       System.out.println("\nRemova os valores ímpares: ");
       numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
       System.out.println(numerosAleatoriosInteger);
//____________________________________________________
         System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteger.stream()
                .skip(3)
                .forEach(System.out::println);
//_______________________________________________________-
        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();
        System.out.println("\nRetirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);
//______________________________________________________
        System.out.print("\nMostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);
//_____________________________________________________________
        System.out.print("\nMostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);;
//__________________________________________________________________
        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("\nPegue apenas os números pares e some: " + somaDosNumerosPares);
//____________________________________________________________________
        System.out.println("\nMostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);
//___________________________________________________________________
        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
 


   }
}
