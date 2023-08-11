package com.iagosouzas.cde.produto;

import java.util.Scanner;

public class Inicializacao {

    AdicionarProduto adicionarProduto = new AdicionarProduto();
    Scanner entrada = new Scanner(System.in);

    int escolha;


    public void iniciar(){
        System.out.println("Seja bem vindo ao Gerenciador de produtos: ");

        System.out.println("\n1. Registrar produto" +
                "\n2. Remover produto");
        escolha = entrada.nextInt();

        switch (escolha){
            case 1:
                adicionarProduto.iniciar();
                break;
            case 2:
                System.out.println("Desenvolvimento");
        }
    }

}

