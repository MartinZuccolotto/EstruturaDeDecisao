package com.company;

import java.util.Scanner;
//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o preço do Produto Um: ");
        Double produtoUm = scanner.nextDouble();
        System.out.print("Insira o preço do Produto Dois: ");
        Double produtoDois = scanner.nextDouble();
        System.out.print("Insira o preço do Produto Tres: ");
        Double produtoTres = scanner.nextDouble();
        boolean produtoUmMaisBarato = produtoUm < produtoDois && produtoUm < produtoTres;
        boolean produtoDoisMaisBarato = produtoDois < produtoUm && produtoDois < produtoTres;
        boolean produtoTresMaisBarato = produtoTres < produtoUm && produtoTres < produtoDois;
        if (produtoUmMaisBarato) {
            System.out.println("O produto mais em conta é o produto1.");
        } if (produtoDoisMaisBarato) {
            System.out.println("O produto mais em conta é o produto2.");
        } if (produtoTresMaisBarato) {
            System.out.println("O produto mais em conta é o produto3.");
        }
        scanner.close();
    }
}
