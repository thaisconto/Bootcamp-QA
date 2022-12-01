public class boletimEstudantil {
    public static void main(String[] args) {
        //criar código para aprovado, reprovado ou prova reforço
        int mediaFinal = 8;
        if(mediaFinal<6)
            System.out.print("REPROVADO");
        else if(mediaFinal==6)
            System.out.print("PROVA REFORÇO");
        else
            System.out.print("APROVADO");
    }
}
