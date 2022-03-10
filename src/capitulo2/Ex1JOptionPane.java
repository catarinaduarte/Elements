package capitulo2;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 35196
 */
public class Ex1JOptionPane {
    
    public static void main (String [] args)  {
        
        int num = 0;
        do {
            try {
                
                num = Integer.parseInt(JOptionPane.showInputDialog(
                       "Introduza um número:"));
            } catch (NumberFormatException numberFormatException){ 
                
                    JOptionPane.showMessageDialog (null, "Formato do número errado, insira de novo");               
               }
            } while (num==0);
                  if ((num % 2) == 0) {
        
                    JOptionPane.showMessageDialog (null,"O número é par");
                    
        
                } else {
                    JOptionPane.showMessageDialog (null,"O número é ímpar");
               
         }     
     }   
}
    
