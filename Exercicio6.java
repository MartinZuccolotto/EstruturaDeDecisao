package com.company;

import java.util.Scanner;
//Faça um Programa que leia três números e mostre o maior deles.
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira três números diferentes para ver qual é o maior.");
        System.out.println("Insira o primeiro número: ");
        Double numeroUm = scanner.nextDouble();
        System.out.println("Insira o segundo número: ");
        Double numeroDois = scanner.nextDouble();
        System.out.println("Insira o terceiro número: ");
        Double numeroTres = scanner.nextDouble();
        boolean numeroUmForMaior = numeroUm > numeroDois && numeroUm > numeroTres;
        boolean numeroDoisForMaior = numeroDois > numeroUm && numeroDois > numeroTres;
        boolean numeroTresForMaior = numeroTres > numeroUm && numeroTres > numeroDois;
        if (numeroUmForMaior) {
            System.out.println("O número "+numeroUm+" è o maior número.");
        }
        else if (numeroDoisForMaior) {
            System.out.println("O número "+numeroDois+" é o maior número.");
        }
        else if (numeroTresForMaior) {
            System.out.println("O número "+numeroTres+" é o maior número.");
        }
        else {
            System.out.println("!!!!!ERRO!!!!!");
        }
        scanner.close();
    }
}
