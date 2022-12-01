package smartTV;

public class usuario {
    public static void main(String[] args) throws Exception {
        
    SmartTv smartTv = new SmartTv();

//imprimir status atual da TV
    System.out.println("a TV ligada ? " + smartTv.ligada);
    System.out.println("canal atual : " + smartTv.canal);
    System.out.println("volume atual : " + smartTv.volume);

//chamando o método ligar-executar e imprimir novo status
    smartTv.ligar ();
        System.out.println("a TV ligada ? " + smartTv.ligada);

//chamando o método desligar-executar e imprimir novo status
    smartTv.desligar ();
        System.out.println("a TV ligada ? " + smartTv.ligada);

//aumentar o volume 3 vezes = 25 + 3 = 28
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();
        System.out.println("volume atual : " + smartTv.volume);

//alterar canal
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.diminuirCanal();
        System.out.println("canal atual é :" + smartTv.canal);
//escolhendo o canal
    smartTv.mudarCanal(10);
    System.out.println("canal atual é :" + smartTv.canal);

}
}
