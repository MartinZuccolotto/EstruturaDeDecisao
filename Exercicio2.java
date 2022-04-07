package com.company;
import  java.util.Scanner;
//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        Double numeroUm = scanner.nextDouble();
        boolean numeroPositivo = numeroUm > 0;
        if (numeroPositivo) {
            System.out.print("O número " + numeroUm+ " é positivo!!");
        } else {
            System.out.print("O número " + numeroUm + " é negativo!!");
        } scanner.close();
    }
}