package com.mycompany.baroes_pisadinha;

import java.util.Scanner;

public class Baroes_pisadinha {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int jan, fev, mar;
        System.out.println("Digite os gastos de janeiro:");
        jan = tc.nextInt();
        System.out.println("Digite os gastos de fevereiro:");
        fev = tc.nextInt();
        System.out.println("Digite os gastos de março:");
        mar = tc.nextInt();
        int soma = jan + fev + mar;
        int media = soma / 3;
            System.out.println("Os gastos totais foram: $" + soma);
            System.out.println ("A media geral foi: $" + media);
    }
}
