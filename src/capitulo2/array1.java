/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2;

/**
 *
 * @author 35196
 */

    
    /* Criacao de array de integer;
* Reparar na variavel i declarada no for e na propriedade ARRAY.length */

public class array1 {
    public static void main(String[] args) {
        final int MAX=6;
        int[] numero = new int[MAX];
        numero[0]=3;
        numero[1]=4;
        numero[2]=0;
        numero[3]=-3;
        numero[4]=1;
        numero[5]=5;
        System.out.println("Array com "+MAX+" posicoes");
        for (int i=0; i<numero.length; i++) {
            System.out.println("numero["+i+"]="+numero[i]);
        }
    }
}

