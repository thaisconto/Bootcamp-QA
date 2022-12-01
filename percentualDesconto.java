import java.util.Scanner;

public class percentualDesconto {
    public static void main(String[] args) {
        
        /*O gerente de uma loja resolveu aplicar descontos em 
        todos os seus produtos! A tarefa é calcular a Porcentagem 
        de Desconto aplicada a esses produtos. 
        A entrada deverá ser feita por dois valores M e D, 
        onde a primeira linha deverá receber o valor marcado 
        do produto, e na segunda linha o valor do produto com o 
        desconto já aplicado.
        A saída deverá retornar o percentual de desconto que 
        foi aplicado no produto   
        exemplo: 40, 30 - D=25%
                500, 195 - D=61% */

        Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite valor inicial: ");
                int valorInicial = scan.nextInt();
        System.out.println("Digite valor final: ");
        int valorFinal = scan.nextInt(); 

        int porcentagemDesconto = (((valorInicial-valorFinal)*100)/valorInicial);

        System.out.println("O desconto foi de: " + porcentagemDesconto + " %");
        



    
    
    }
}
