package capitulo2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author 35196
 */
public class Ex10Switch {
   
    public static void main(String[] args) {
            int mes;
            String r;
          // System.out.println("Introduza um numero, para o mês, de 1 a 12 ");
          // Scanner ler= new Scanner (System.in);
          // mes = ler.nextint ();
          
        mes=Integer.parseInt(JOptionPane.showInputDialog(
        "Introduza um numero, para o mês, de 1 a 12"));
        switch (mes){
            case 1: r="Janeiro";
                    break;
            case 2: r="Fevereiro";
                    break;
            case 3: r="Março";
                    break;
            case 4: r="Abril";
                    break;
            case 5: r="Maio";
                    break;
            case 6: r="Junho";
                    break;
            case 7: r="Julho";
                    break;
            case 8: r="Agosto";
                    break;
            case 9: r="Setembro";
                    break;
            case 10: r="Outubro";
                    break;
            case 11: r="Novembro";
                    break;
            case 12: r="Dezembro";
                    break;
                    
            default: r= "Mês invalido. Introduza um nr de 1 a 12!";
                break;
              }  
                // System.out.println (" O mês introduzido foi "+mes+" que correspomde a "+r);
                JOptionPane.showMessageDialog(null,"O mês introduzido foi"+mes+" que corresponde a" +r);
             }        
        }


