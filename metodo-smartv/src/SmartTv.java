public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
     }
     public void desligar(){
           ligada = true;
     }
 
    public void mudarCanal(int novoCanal){
       canal = novoCanal;                     // mudar canal informando
    }
    public void aumentarCanal(){
        canal ++;                // mudar canal incrementndo 1 em 1
    }
    public void diminuirCanal(){
        canal --;                // mudar canal decrementando 1 em 1
    }
    public void aumentarVolume(){
        volume ++;
    }
    public void diminuirVolume(){
        volume --;
    }
  
}// fim da classe