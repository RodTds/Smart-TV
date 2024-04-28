package edu.rodrigo.primeirasdemana;
public class MinhaClasse {
   public static void  main(String[] args){
    // declarações
    String primeiroNome = "rodrigo";
    String segundoNome ="Silva";
    System.out.print(nomeCompleto(primeiroNome, segundoNome));
  
   }// fim da main
     // métodos( função)
   public static String nomeCompleto(String primeiroNome,String segundoNome){
        return "Nome Completo: " + primeiroNome.concat(" ").concat(segundoNome);
    }// fim da função somar 

}// fim da minha classe geral  
