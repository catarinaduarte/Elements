/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2;

import static java.lang.Integer.max;
import static java.lang.Math.pow;
import static java.lang.Math.random;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

/**
 *
 * @author catarina
 */
public class Ex1FuncoesMat {
    public static void main(String[] args) {
        int x=5, y=89;
        int max=500, min=250;
        System.out.println("Raiz quadrada de "+x+"="+round(sqrt(x)));
        System.out.println("Maior entre x, y = "+max(x, y));
        System.out.println("2 elevado a 10 = "+pow(2,10));
        System.out.println("Número aleatorio entre 0 e 1="+random());
        System.out.println("Número aleatorio entre "+min+" e "+max+"="+round (min + random ()*(max-min)));
    }

}    
    

