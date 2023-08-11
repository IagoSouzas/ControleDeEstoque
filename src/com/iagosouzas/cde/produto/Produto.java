package com.iagosouzas.cde.produto;

import java.util.Scanner;

public class Produto {
    private String nome;
    private int unidade;
    private double valor;

    public void cadastrar(Scanner entrada) {
        System.out.println("\nDigite o nome do produto: ");
        nome = entrada.nextLine();

        System.out.println("Digite o valor: ");
        valor = entrada.nextDouble();

        System.out.println("Digite a quantidade de unidades: ");
        unidade = entrada.nextInt();
        entrada.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public int getUnidade() {
        return unidade;
    }

    public double getValor() {
        return valor;
    }






}

