package com.company;

import java.util.Scanner;
//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
public class Exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("==Digite uma letra para saber se é vogal ou consoante.\n==Digite sua letra: ");
        String letraInformada = scanner.nextLine();
        boolean letraForVogal = letraInformada.equals("a") || letraInformada.equals("A") ||
                letraInformada.equals("e") || letraInformada.equals("E") ||
                letraInformada.equals("i") || letraInformada.equals("I") ||
                letraInformada.equals("o") || letraInformada.equals("O") ||
                letraInformada.equals("u") || letraInformada.equals("U");
        if (letraForVogal) {
            System.out.println("A letra Insirida é vogal.");
        } else {
            System.out.println("A letra Insirida é consoante.");
        }
        scanner.close();
    }
}
