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
public class array02 {
    /* Criacao de array de float com duas dimensoes;
* Repare na variavel i, declarada no for e na propriedade
* ARRAY.length com duas dimensões */

 public static void main(String[] args) {
    final int LINHA=6;
    final int COLUNA=2;
    float[][] numero=new float[LINHA][COLUNA];
    numero[0][0]= 1.0f;
    numero[0][1]= 2.0f;
    numero[1][0]= 3.0f;
    numero[1][1]= 4.0f;
    numero[2][0]= 5.0f;
    numero[2][1]= 6.0f;
    numero[3][0]= 7.0f;
    numero[3][1]= 8.0f;
    numero[4][0]= 9.0f;
    numero[4][1]=10.0f;
    numero[5][0]=11.0f;
    numero[5][1]=12.0f;
    System.out.println("Array-->numero["+LINHA+"]["+COLUNA+"]");
    for (int i=0; i<numero.length; i++) {
        for (int j=0; j<numero[0].length; j++) {
            System.out.print("numero["+i+"]["+j+"]="+numero[i][j]+" \t");
        }
        System.out.println(" ");
       }
   }
}

