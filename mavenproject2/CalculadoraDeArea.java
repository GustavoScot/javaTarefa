package com.mycompany.mavenproject2;

public class CalculadoraDeArea {

    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public double calcularArea(double raio, boolean Circulo) {
        if (Circulo) {
            return 3.14 * raio * raio;
        }
        return 0;
    }

    public static void main(String[] args) {
        CalculadoraDeArea calc = new CalculadoraDeArea();

        double areaQuadrado = calc.calcularArea(4);
        System.out.printf("Area do quadrado: %.2f \n", areaQuadrado);

        double areaRetangulo = calc.calcularArea(6, 8);
        System.out.printf("Area do retangulo: %.2f \n", areaRetangulo);

        double areaCirculo = calc.calcularArea(5, true);
        System.out.printf("Area do circulo: %.2f \n", areaCirculo);
    }
}