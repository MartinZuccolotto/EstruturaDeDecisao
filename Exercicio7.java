package com.company;

import java.util.Scanner;
//Faça um Programa que leia três números e mostre o maior e o menor deles.
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira três números diferentes para ver qual é o maior.");
        System.out.print("Insira o primeiro número: ");
        Double numeroUm = scanner.nextDouble();
        System.out.print("Insira o segundo número: ");
        Double numeroDois = scanner.nextDouble();
        System.out.print("Insira o terceiro número: ");
        Double numeroTres = scanner.nextDouble();
        boolean numeroUmEMaior = numeroUm > numeroDois && numeroUm > numeroTres;
        boolean numeroDoisEMaior = numeroDois > numeroUm && numeroDois > numeroTres;
        boolean numeroTresEMaior = numeroTres > numeroUm && numeroTres > numeroDois;
        if (numeroUmEMaior) {
            System.out.println("O número "+numeroUm+" è o maior número.");
        } else if (numeroDoisEMaior) {
            System.out.println("O número "+numeroDois+" é o maior número.");
        } else if (numeroTresEMaior) {
            System.out.println("O número "+numeroTres+" é o maior número.");
        } else {
            System.out.println("!!!!!ERRO!!!!VOCÊ INFORMOU NÚMERO IGUAIS!!!");
        }
        boolean numeroUmEMenor = numeroUm < numeroDois && numeroUm < numeroTres;
        boolean numeroDoisEMenor = numeroDois < numeroUm && numeroDois < numeroTres;
        boolean numeroTresEMenor = numeroTres < numeroUm && numeroTres < numeroDois;
        System.out.println("====================================");
        if (numeroUmEMenor) {
            System.out.println("O número "+numeroUm+ " é o menor número.");
        } else if (numeroDoisEMenor) {
            System.out.println("O número "+numeroDois+ " é o menor número.");
        } else if(numeroTresEMenor) {
            System.out.println("O número "+numeroTres+ " é o menor número.");
        } else {
            System.out.println("!!!!!ERRO!!!!VOCÊ INFORMOU NÚMERO IGUAIS!!!");
        }
        scanner.close();
    }
}