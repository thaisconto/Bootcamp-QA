import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
//com duas excessões: não pode colocar letras nem dividir por zero
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                //onde coloca a lógica onde pode ocorrer a exception
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
            }
            finally {
                //não é obrigatório colocar o finally sempre
                System.out.println("Chegou no finally!");
            }
        } while(continueLooping);


        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}