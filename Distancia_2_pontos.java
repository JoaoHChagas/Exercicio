package com.mycompany.distancia_2_pontos;
public class Distancia_2_pontos {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o valor de x1");
         double x1 = tc.nextDouble();
        System.out.println("Digite o valor de y1");
         double y1 = tc.nextDouble();
        System.out.println("Digite o valor de x2");
         double x2 = tc.nextDouble();
        System.out.println("Digite o valor de y2");
         double y2 = tc.nextDouble();
         double primeiro_termo = (x2 - x1)*(x2 - x1);
         double segundo_termo = (y2 - y1)*(y2 - y1);
         double dist = primeiro_termo + segundo_termo;
    }
}
