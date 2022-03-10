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
public class string1 {
  public static void main(String args[]) {
    String s1 = "Joao";
    String s2 = "Joao";
    String s3 = s2.substring(0,2)+"ao";
    
    System.out.println(s3);
    if (s1 == s2) {
       System.out.println("s1==s2");
    } else {
        System.out.println("s1!=s2");
    }
    if (s1 == s3) {
       System.out.println("s1==s3");
    } else {
       System.out.println("s1!=s3");
    }
    if (s1.equals(s3) && s1.equals(s2)) {
       System.out.println("Os conteúdos são iguais");
    } else {
       System.out.println("Os conteúdos são diferentes");
    }
    // É melhor por "Paulo".equals(s1)
    if (s1.equals("Paulo")) {
    System.out.println("São iguais");
    } else {
    System.out.println("São diferentes");
    }
  }  
}
