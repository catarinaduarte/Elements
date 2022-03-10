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
public class Ex1IfElseIf {
  
    public static void main(String args[]) {
        int nota=13;
        String s;
        if (nota>=18) {
            s="Muito Bom";
        } else {
            if (nota>=14) {
                s="Bom";
            } else {
                 if (nota>=10) {
                     s="Suficiente";
                } else {
                    if (nota>=7) {
                        s="Mediocre";
                    } else {
                        s="Mau";
                    }
                }
            }
        }
        System.out.println("Nota qualitativa="+s);
    }
}

    
