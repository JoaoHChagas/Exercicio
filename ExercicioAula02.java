package com.mycompany.exercicioaula02;
import java.util.Scanner;
public class ExercicioAula02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num1 = teclado.nextInt();
        System.out.println("Digite outro numero:");
        int num2 = teclado.nextInt();
        int soma = num1 + num2;
        int multi = num1 * num2;
        System.out.println("O resultado da soma e: " + soma);
        System.out.println("O resultado da multiplicacao e: " + multi);
        boolean igual = num1 == num2;
        System.out.println("Os numeros sao iguais? " + igual);
        boolean maior = soma > 20;
        System.out.println("A soma e maior que vinte? " + maior);
    }
}
