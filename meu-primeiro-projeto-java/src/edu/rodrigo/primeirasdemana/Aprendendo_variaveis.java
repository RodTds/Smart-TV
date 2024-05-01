package edu.rodrigo.primeirasdemana;
public class Aprendendo_variaveis {
   public static void main(String[] args){
       byte idade = 123;
       short ano = 2023;
       int cep = 19089000; // se comecar com 0 java nao armazena ai usar string
       long cpf = 32112334554L; // precisa L no final// mesma coisa aqui se começar com 0
       float pi = 3.14F; // float tem que ter f no final pode ser minusculo
       double salario = 1275.33;

       // maiuscula e final antes do tipo e uma constante
       final double PI = 3.14;//constante nunca muda esse valor
       System.out.println(cpf);
       boolean teste = false;
       System.out.println(!teste);// neguei o valor da variavel booleana

       // operador ternário
       int a=3;
       int b = 3;
       String resultado ="";
       if(a == b)
          resultado ="Verdadeido";   
       else  
           resultado="Falso";
        System.out.println(resultado);
        // ou // verificar condição sem " IF "" e tabem da pra usar com variavel tipo inteiro  int
        // int resultado,  resultado = a==b?"1" : "0"
        resultado = a==b?"verdadeiro" : "falso";
        System.out.println(resultado);

        // boleana recebendo um valor na comparação sem " IF ""
        boolean result = a==b;
        System.out.println(result);
        // usanfo equals() usar para comparar quando for OBJETOS
        String nome1 ="Rodrigo";
        String nome2 = new String("Rodrigo"); 
        System.out.println(nome1.equals(nome2));




    }// fim da main
    
}// fim classe geral
