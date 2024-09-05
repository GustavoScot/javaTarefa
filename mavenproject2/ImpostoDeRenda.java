package com.mycompany.mavenproject2;

public class ImpostoDeRenda {

    private String nome;
    private double salario;

    public ImpostoDeRenda(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularImposto() {
        double imposto;
        
        if (salario <= 1903.98) {
            imposto = 0; // Isento
        } else if (salario <= 2826.65) {
            imposto = salario * 0.075; 
        } else if (salario <= 3751.05) {
            imposto = salario * 0.15; 
        } else if (salario <= 4664.68) {
            imposto = salario * 0.225; 
        } else {
            imposto = salario * 0.275;
        }
        return imposto;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: R$ " + salario);
        System.out.printf("Imposto de Renda: R$ %.3f", calcularImposto());
    }

    public static void main(String[] args) {
        ImpostoDeRenda pessoa = new ImpostoDeRenda("Gustavo M", 6500.00);

        pessoa.exibirInformacoes();
    }
}
