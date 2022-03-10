/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2;

/**
 *
 * @author catarina
 */
public class Ex1Variaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a, b, h, o;
      String s;
      a=2;
      b=2;
      h=0x000D;
      o=011;
        System.out.println("h="+h+"  o="+o);
        System.out.println("h (em binário)=" + Integer.toBinaryString(h));
        
        
        s="Total="; // inialização independente da declaração
        System.out.println("s+(a+b))");
        
        float f=2.14f;
        double d=3e10;
        char c='a';
        System.out.println("float="+f);
        System.out.println("double="+d);
        System.out.println("char="+c);
      
    }
    
}
