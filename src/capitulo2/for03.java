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
public class for03 {
  
    public static void main(String args[]) {
         int i, n=17;
         int factI = 1;
         long factL = 1;
         // calculo do factorial de uma variável inteira...
         // em que o máximo só vai até 12...
         for (i = 1; i<=n; i++) {
            factI *= i;
            factL *= i;
            System.out.println(i + "!=" + factI + " \t " + factL);
        }
    } 
}
