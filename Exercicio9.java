package com.company;

import java.util.Scanner;
//Faça um Programa que leia três números e mostre-os em ordem decrescente.
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("!!!INSIRA TRÊS NÚMEROS PARA COLOCAR EM ORDEM DECRESCENTE!!!");
        System.out.println("===================================");
        System.out.print("Insira o primeiro número: ");
        Double numeroUm = scanner.nextDouble();
        System.out.print("Insira o segundo número: ");
        Double numeroDois = scanner.nextDouble();
        System.out.print("Insira o terceiro número: ");
        Double numeroTres = scanner.nextDouble();
        if ((numeroUm < numeroDois) && (numeroUm < numeroTres)) {
            System.out.print("O número "+numeroUm+" é o menor número.\n");
        }else if ((numeroDois < numeroUm) && (numeroDois < numeroTres)) {
            System.out.print("O número "+numeroDois+" é o menor número.\n");
        } else if ((numeroTres < numeroUm) && (numeroTres < numeroDois)) {
            System.out.print("O número "+numeroTres+" é o menor número.\n");
        }
        if ((numeroUm > numeroDois) && (numeroUm < numeroTres) || (numeroUm < numeroDois) && (numeroUm > numeroTres)) {
            System.out.print("O número "+numeroUm+" é o segundo maior número.\n");
        } else if ((numeroDois > numeroUm) && (numeroDois < numeroTres) || (numeroDois < numeroUm) && (numeroDois > numeroTres)) {
            System.out.print("O número "+numeroDois+" é o segundo maior número.\n");
        } else if ((numeroTres > numeroUm) && (numeroTres < numeroDois) || (numeroTres < numeroUm) && (numeroTres > numeroDois)) {
            System.out.print("O número "+numeroTres+" é o segundo maior número.\n");
        }
        if ((numeroUm > numeroDois) && (numeroUm > numeroTres)){
            System.out.print("O número "+numeroUm+" é o maior número.");
        } else if ((numeroDois > numeroUm) && (numeroDois > numeroTres)){
            System.out.print("O número "+numeroDois+" é o maior número.");
        } else if ((numeroTres > numeroUm) && (numeroTres > numeroDois)){
            System.out.print("O número "+numeroTres+" é o maior número.");
        }
        scanner.close();
    }
}
