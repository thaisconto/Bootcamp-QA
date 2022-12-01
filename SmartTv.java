package smartTV;

public class SmartTv {
    
//determinando os atributos
   boolean ligada = false;
   int canal = 1;
   int volume = 25;

//criar método ligar
   public void ligar(){
      ligada=true;
   }
//criar método desligar
   public void desligar(){
   ligada=false;
}

//criar método de alterar volume +1
   public void aumentarVolume(){
      volume = volume +1;
         System.out.println("aumentando o volume para: " + volume);
      // ou poderia ser volume++;
   }
//criar método de alterar volume -1
   /**
    * 
    */
   public void diminuirVolume(){
   volume = volume -1;
      System.out.println("diminuindo o volume para: " + volume);
   // ou poderia ser volume--;
   }
//método para alterar canal
      public void aumentarCanal(){
      canal = canal +1;
         System.out.println("aumentando o canal para: " + canal);
      }
      public void diminuirCanal(){
      canal = canal -1;
         System.out.println("diminuindo o canal para: " + canal);
         }
      public void mudarCanal (int novoCanal){
      canal = novoCanal;
         System.out.println("você escolheu o canal: " + canal);
      }

}

