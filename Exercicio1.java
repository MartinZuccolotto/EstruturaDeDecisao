package com.company;
import  java.util.Scanner;
// Faça um Programa que peça dois números e imprima o maior deles
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Isira o primeiro número: ");
        Double numeroUm = scanner.nextDouble();
        System.out.print("Insira o segundo número: ");
        Double numeroDois = scanner.nextDouble();
        boolean numeroUmEmaior = numeroUm > numeroDois;
        if (numeroUmEmaior) {
            System.out.print("O maior número entre eles é: " + numeroUm);
        } else{
            System.out.print("O maior número entres eles é o: " + numeroDois);
        }
        scanner.close();
    }
}