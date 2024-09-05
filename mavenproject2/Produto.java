package com.mycompany.mavenproject2;

public class Produto {

    private String nome;
    private String codigo;
    private double preco;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Nome do Produto: " + nome);
    }

    public void exibirInfo(boolean exibirCodigo) {
        System.out.println("Nome do Produto: " + nome);
        if (exibirCodigo) {
            System.out.println("Codigo do Produto: " + codigo);
        }
    }

    public void exibirInfo(boolean exibirCodigo, boolean exibirPreco) {
        System.out.println("Nome do Produto: " + nome);
        if (exibirCodigo) {
            System.out.println("Codigo do Produto: " + codigo);
        }
        if (exibirPreco) {
            System.out.println("Preco do Produto: R$ " + preco);
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Televisao", "264FTT", 5000.00);

        System.out.println("Exibindo apenas o nome:");
        produto.exibirInfo();
        System.out.println();

        System.out.println("Exibindo nome e codigo:");
        produto.exibirInfo(true);
        System.out.println();

        System.out.println("Exibindo todas as informacoes:");
        produto.exibirInfo(true, true);
    }
}
