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
public class for05 {
    public static void main(String args[]) {
        int ano;
        do {
            String s = javax.swing.JOptionPane.showInputDialog("Qual o ano?");
            ano = Integer.parseInt(s);
        } while (ano<=1752);
 // e' bissexto se for divisivel por 4, excepto os divisiveis por 100
 // mas contando com os divisiveis por 400
 // 1900 nao e' bissexto, mas 2000 e' bissexto
        if ((ano%4==0) && ((ano%100!=0) || (ano%400==0))) {
             System.out.println(ano+" e' bissexto!");
        } else {
            System.out.println(ano+" nao e' bissexto!");
        }
    }

}
