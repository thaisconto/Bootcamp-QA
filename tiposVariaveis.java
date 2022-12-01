    public class tiposVariaveis{

    public static void main(String[] args) {

//tipos variaveis
    byte idade = 123;
	short ano = 2021;
	int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
	long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
	float pi = 3.14F;
	double salario = 1275.33;

//meus dados
    String nome = "Thais";
    int minhaIdade = 28;
    double peso = 66.5;
    char sexo = 'F';
    boolean doadorOrgao = false;


//operadores
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    int exemplo = (10 * 7) + (20/4);
    String nomeCompleto = "LINGUAGEM" + "JAVA"; //operador + usado como concatenar
     
//entender operador +
    // 1+1+1+"1" = 31
    // 1+"1"+1+1 = 1111
    // 1+"1"+1+"1"= 1111
    // "1"+1+1+1 = 1111
    // "1"+(1+1+1) = 13

    
    String concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);

//classe unarios
    int numero = 5;
//Imprimindo o numero negativo
        System.out.println(- numero);
//incrementando numero em mais 1 numero, imprime 6
    numero ++;
        System.out.println(numero);
//incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo
        System.out.println(numero);// agora sim, numero virou 7
//ordem de precedencia conta aqui
        System.out.println(++ numero);
    boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);


//estrutura IF
    int a, b;
    a = 5;
    b = 6;
    String resultado = "";

//EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    if(a==b)
        resultado = "verdadeiro";
    else
        resultado = "falso";

//UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
    String valor = (a==b) ? "verdadeiro" : "false";
        System.out.println(resultado);

//operadores relacionais
    int numero1 = 1;
    int numero2 = 3;

    if(numero1 > numero2){
	    System.out.println("Numero 1 maior que numero 2");}

    if(numero1 < numero2){
	    System.out.println("Numero 1 menor que numero 2");}

    if(numero1 >= numero2){
	    System.out.println("Numero 1 maior ou igual que numero 2");}

    if(numero1 <= numero2){
	    System.out.println("Numero 1 menor ou igual que numero 2");}

    if(numero1 != numero2){
	    System.out.println("Numero 1 é diferente de numero 2");}

        //para comprar dois nomes ou objetos, utiliza equals

//operadores lógicos
    boolean condicao1=true;
    boolean condicao2=false;

/* operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");

}}