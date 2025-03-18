package com.mycompany.exercicioaula01;
import java.util.Scanner;
public class ExercicioAula01 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String nome = texto.nextLine();
        int tamanho = nome.length();
        boolean maior = tamanho > 15;
        
        System.out.println("Seu nome e: " + nome);
        System.out.println(nome + " tem " + tamanho + " caracteres");
        System.out.println("Tem mais de 15 letras? " + maior);
        texto.close();
    }
}
