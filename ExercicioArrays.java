package com.mycompany.exercicioarrays;

import java.util.Scanner;

public class ExercicioArrays {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeticoes = input.nextInt();
        int[] idades = new int[2];
        
        for(int i = 0; i < idades.length; i++){
            System.out.println("Digite a idade " + i + ": ");
            idades[i] = input.nextInt();
     }       
        System.out.println("Idades registradas: ");
            
        for(int i = 0; i < idades.length; i++){
            System.out.println("Posicao: " + i + "Idade " + idades);                  
     }   
    }
}
