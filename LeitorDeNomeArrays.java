package com.mycompany.leitordenomearrays;

import java.util.Scanner;

public class LeitorDeNomeArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[4];
        
        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite um nome " + (i+1) + ":");
            nomes[i] = input.nextLine();
        }
        for(int i = 0; i < nomes.length; i++){
            String msg = "Posicao " + i + " - " + nomes[i] + " - " + nomes[i].length() + " caracteres";
            System.out.println(msg);
        }
    }
}
