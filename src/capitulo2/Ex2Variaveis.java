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
public class Ex2Variaveis {
    public static void main(String[] args) {
      byte b=3;
      short s;
      int i;
      long l;
      float f=3.0f;
      double d;
      char c='a';
        s=b; //short <--byte
        System.out.println("short=" + s);
        i=s; // int <-- short
        System.out.println("int=" +i);
        i=c; // int <-- chart
        System.out.println("int=" +i);
        l=i; // long <-- int
        System.out.println("long=" +l);
        f=i; // foat <-- int
        System.out.println("float=" +f);
        f=l; // foat <-- long
        System.out.println("float=" +f);
        d=i; // double <-- int
        System.out.println("double=" +d);
        d=l; // double <-- long
        System.out.println("double=" +d);
        d=f; // double <-- float
        System.out.println("double=" +d);
        
        // Exemplos sem perda de presisão...
        // float + int = float
        float x=f+i;
        System.out.println("f="+x);
       
        // float + int = int
        int y = (int) f+i;
        System.out.println("i="+y);
        
        // exemplos com perda de presição...-->ATENÇÃO!
        i = 16777217;
        f = i;
        System.out.println(f); // imprime 1.677216E7 em vez de 1.677217E7
       
    }
    
 }