package com.mycompany.mavenproject2;

public class CalculadoraDeSoma {

    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double somar(double a, double b, double c) {
        return a + b + c;
    }

    public double somar(int a, double b) {
        return a + b;
    }

    public double somar(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        CalculadoraDeSoma calc = new CalculadoraDeSoma();

        System.out.println("Soma de dois inteiros: " + calc.somar(6, 7));

        System.out.println("Soma de três inteiros: " + calc.somar(8, 2, 6));

        System.out.printf("Soma de dois decimais: %.2f \n", calc.somar(8.5, 9.7));

        System.out.printf("Soma de três decimais: %.2f \n", calc.somar(5.4, 7.7, 4.3));

        System.out.printf("Soma de um inteiro e um decimal: %.2f \n", calc.somar(10, 4.5));

        System.out.printf("Soma de um decimal e um inteiro: %.2f \n", calc.somar(6.6, 4));
    }
}

