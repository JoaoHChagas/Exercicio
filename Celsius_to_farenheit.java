package com.mycompany.celsius_to_farenheit;

import java.util.Scanner;

public class Celsius_to_farenheit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma temperatura em C");
        double celcius = teclado.nextDouble();
        //F = 1,8C + 32
        double farenheit = 1.8*celcius+32;
        System.out.println("O valor convertido e:" + farenheit);
        
    }
}
