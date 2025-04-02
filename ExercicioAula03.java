package com.mycompany.exercicioaula03;

public class ExercicioAula03 {

    public static void main(String[] args) {
        
        int num1 = 20;
        int num2 = 15;
        int num3 = 7;
        boolean condicao = false;
        String texto = "test";
        String palavra = "Unifg";
        String facul= "Unifg";
        
        boolean condicao1 = num1 < num2;//true
        boolean condicao2 = palavra.toLowerCase() == facul;//false
        boolean condicao3 = texto.length() >= num3;//true
        boolean condicao4 = condicao && condicao3;//false
        boolean condicao5 = condicao2 && condicao4;//false
        boolean condicao6 = condicao1 || condicao5;//true
        
        if (condicao6){
            System.out.println("ENTROU NO IF");
            
        }else{
            System.out.println("ENTROU NO ELSE");
        }                        
    }
}
