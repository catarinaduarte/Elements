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
public class for04 {
    public static void main(String args[]) {
        int i, n=20;
        float fact = 1.0f;
        for (i = 1; i <= n; i++) {
            fact *= i;
                // maneira de contornar o valor máximo de um inteiro...
        if (fact > Integer.MAX_VALUE) {
            System.out.println(i + "!=" +" Erro!!! Máximo inteiro excedido");
        } else {
            System.out.println(i + "!=" + (int) fact);
            }
         }
    }
}
