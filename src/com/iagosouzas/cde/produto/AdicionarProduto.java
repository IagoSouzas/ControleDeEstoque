package com.iagosouzas.cde.produto;

import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarProduto {

    ArrayList<Produto> produtos = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    int numProdutos;


    void iniciar(){
        System.out.println("Deseja cadastrar quantos produtos? ");
        numProdutos = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < numProdutos; i++) {
            Produto novoProduto = new Produto();
            novoProduto.cadastrar(entrada);
            adicionar(novoProduto);
        }
        imprimirProdutos();
    }

    void adicionar (Produto produto){

        produtos.add(produto);

    }

    void imprimirProdutos(){
        for (Produto produto : produtos) {
            System.out.println("\nProduto: " + produto.getNome() + "\nvalor: R$" + produto.getValor() + "\nunidades: " + produto.getUnidade());
        }
    }





}
