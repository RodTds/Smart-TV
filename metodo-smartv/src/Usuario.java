public class Usuario {
    public static void main(String[] args) throws Exception {

      SmartTv smartTv = new SmartTv(); // chama a classe no formulario classe SMART-TV
      // mudaando o canal chamando metodos da classe de outro formulario
      // passando parametro
      // mudando o volume chamando metodos da classe outro formulario
      smartTv.desligar();
      System.out.println("Esta Ligada ? " + smartTv.ligada);
     
      smartTv.mudarCanal(13);
      System.out.println("Volume " + smartTv.canal); 
      smartTv.aumentarCanal();
      System.out.println("Canal Atual: " + smartTv.canal);
      if(smartTv.ligada == true)
        System.out.println("a Tv esta Ligada");
      else
          System.out.println("A tv esta Desligada");
    } // fim void main
}// fim da classe
