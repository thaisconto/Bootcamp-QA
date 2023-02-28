import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console.
public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "receita.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            //se for um erro para encontrar o arquivo
            //precisa colocar as exceptions na ordem de hierarquia(menor para maior)
            //por isso IO(mãe-genérica) vai depois que File(específica)
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir! ");
            //e.printStackTrace();
        } catch (IOException e){
            //se for um erro na tentativa de leitura do arquivo
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}