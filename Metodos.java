package com.mycompany.metodos;

public class Metodos {
    public static void mensagem(){
        System.out.println("Metodo sem parametro e sem retorno");
    }
    public static void nome(String nome1, String nome2){
        System.out.println("Nome: " + nome1 + "Sobrenome: " + nome2);
    }
    public static int soma(int numero){
        return numero + 100;
    }
    public static void main(String[] args) {
        String nome = "João";
        String sobrenome = "Chagas";
        int num = 444;
        mensagem();
        nome("Henrique", "Donato");
        nome(nome, sobrenome);
        nome(nome, "teste"); 
        
        System.out.println("Somando + 100: " + soma(5));
        System.out.println("Somando + 100:" + soma(50));
        System.out.println("Somando + 100: " + soma(32));
        System.out.println("Somando + 100: " + soma(num));
    }
}
