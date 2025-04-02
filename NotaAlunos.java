package com.mycompany.notaalunos;

import java.util.Locale;
import java.util.Scanner;

public class NotaAlunos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        System.out.println("Digite sua nota:");
        
         double nota = teclado.nextDouble();
         
         if (nota >= 7) {
            System.out.println("Aprovado"); 
       } else if (nota >= 6 && nota <7) { 
             System.out.println("Aprovado na recuperacao"); 
       } else { 
             System.out.println("Reprovado"); }
         
        teclado.close();                       
    }
}
