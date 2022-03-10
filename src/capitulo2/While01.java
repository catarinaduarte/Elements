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
public class While01 {

public static void main (String[] args) {
   int soma=0; // acumulador
   int valor=1; // contador

    while (valor<=4) {
        soma += valor; // soma = soma + valor;
        System.out.println("Valor= "+(valor++)+" Soma="+soma);
//      valor++;

    }
        System.out.println("\nValor à saida ciclo foi=" +(valor)
                + " Soma final ="+soma+"\n\n");
        System.out.println("for");
        
        valor=1; soma=0; //Reiniciacao da variavel                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        while (valor<=4){
           soma += valor; //soma= soma +   valor;
           System.out.println("Valor=" +(valor)+"Soma="+soma);
           valor++;
        }
         System.out.println("\nValor à saida do ciclo foi="+(valor)
                   +" Soma final="+soma+"\n\n");
    }  
}

