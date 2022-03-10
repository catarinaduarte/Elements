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
public class ExSwitch02 {
    public static void main(String args[]) {
        int mes=2, ano=2100, numDias=0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias=30;
                break;
            case 2:
                /*so funciona quando o ano e' >= 1752 */
                if ((ano%4==0) && ((ano%100!=0) || (ano%400==0))) {
                    numDias=29;
                }else{
                    numDias=28;
                }
                break;
            default:
                System.out.println("Nao e' um mes valido");
                numDias=0;
                break;
        }
        if (numDias != 0) {
            System.out.println("Numero de dias do mes="+numDias);
        }
    }
}

