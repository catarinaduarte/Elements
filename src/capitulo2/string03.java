/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Criacao de um array de strings.
* Repare no comprimento variavel das Strings. */
package capitulo2;

public class string03 {
    public static void main(String[] args) {
        String[] as = new String[10];
        as[0]="Bom dia 1";
        as[1]="Bom dia 12";
        for (int i=2; i<as.length; i++) {
            as[i]="Ola"+i;
        }
        for (int i=0; i<as.length; i++) {
            System.out.println("as["+i+"]="+as[i]+"="+as[i].length());
        }
    }
}
