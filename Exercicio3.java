package com.company;

import  java.util.Scanner;
//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("===Informe seu sexo\n===Digite M para Masculino e F para Feminino: ");
        char generoInformado = scanner.next().charAt(0);
        boolean generoInformadoForMasculino = generoInformado == 'm' || generoInformado == 'M';
        boolean generoInformadoForFeminino = generoInformado =='f' || generoInformado == 'M';
        System.out.println("==================================");
        if (generoInformadoForMasculino) {
            System.out.println("Seu sexo é Masculino!!");
        } else if (generoInformadoForFeminino) {
            System.out.println("Seu sexo é Feminino!!");
        } else {
            System.out.println("Seu sexo é Indefinido!!");
        }
        scanner.close();
    }
}


