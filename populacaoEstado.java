import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class populacaoEstado {
    public static void main(String[] args) {
        System.out.println("\nCrie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populaçãoEstadosNE = new HashMap<>();
            populaçãoEstadosNE.put("PE", 9616621);
            populaçãoEstadosNE.put("AL", 3351543);
            populaçãoEstadosNE.put("CE", 9187103);
            populaçãoEstadosNE.put("RN", 3534265);
        
        System.out.println(populaçãoEstadosNE);

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        populaçãoEstadosNE.put("RN", 3534165);
        System.out.println(populaçãoEstadosNE);

        System.out.println("\nConfira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        populaçãoEstadosNE.put("PB", 4039277);
        System.out.println(populaçãoEstadosNE);

        System.out.println("\nExiba a população do estado PE: " + populaçãoEstadosNE.get("PE"));

        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populaçãoEstadosNE2 = new LinkedHashMap<>();
            populaçãoEstadosNE2.put("PE", 9616621);
            populaçãoEstadosNE2.put("AL", 3351543);
            populaçãoEstadosNE2.put("CE", 9187103);
            populaçãoEstadosNE2.put("RN", 3534265);
            populaçãoEstadosNE2.put("PB", 4039277);
        
        System.out.println(populaçãoEstadosNE2);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populaçãoEstadosNE3 = new TreeMap<>(populaçãoEstadosNE);
        System.out.println(populaçãoEstadosNE3);

        Collection<Integer> populacao = populaçãoEstadosNE.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("\nExiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("\nExiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populaçãoEstadosNE.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma da população desses estados: " + soma);
/*        int soma2 = 0;
       for(Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
           soma2 += entry.getValue();
       }
*/

        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma / populaçãoEstadosNE.size()));
        
        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populaçãoEstadosNE.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populaçãoEstadosNE);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        populaçãoEstadosNE.clear();
        System.out.println(populaçãoEstadosNE);

        System.out.println("\nConfira se a lista está vazia: " + populaçãoEstadosNE.isEmpty());

    }
}
