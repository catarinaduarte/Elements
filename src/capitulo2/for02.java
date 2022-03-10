package capitulo2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 35196
 */
public class for02 {
   public static void main(String[] args) {
        long k;
        for (k = 1; k <= 5; k++)
            System.out.print(k + ";");
        System.out.println(".");
        for (k = 1; k++ <= 5; ) // ++k – fazer esta variação numa cópia 
            System.out.print(k + ";");
        System.out.println(".");
        k = 1;
        for ( ; ++k <= 5; ) // k=1 e ++k - fazer esta variação numa cópia
            System.out.print(k + ";");
        System.out.println(".");
    }
}

