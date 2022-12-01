public class MinhaClasse {


// criar um sub-grupo de código
    public static void main (String [] args) {


// imprimir mensagem olá
    System.out.print ("olá "); 

    
        //declarar variaveis: Tipo nomeDefinido = Atribuição;
        String meuNome = "Thaís"; //para escritas
        int idade = 28; //para inteiros-numeros
        boolean verdadeira; //para true e false
        idade = 27; //alterando uma variável não fixa
        final String NASCIMENTO = "Brasil"; //variável fixa, não pode ser alterada
        String primeiroNome = "Thaís";
        String segundoNome = "Marchetti";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    //declarar métodos: TipoRetorno NomeObjetivoNoInfinivo Parametro(s)
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        
        return "Resultado do método" + primeiroNome.concat(" ").concat(segundoNome); //retornar.concatenar.variáveis



    }
}
