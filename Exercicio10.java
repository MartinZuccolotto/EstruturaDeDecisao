package com.company;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite M para matutino, V para verpertino e N para noturno");
        System.out.print("Informe o turno em que voce estuda: ");
        String letra = scanner.nextLine();

        if (letra.equals("M") || (letra.equals("m"))){
            System.out.println("Bom dia!");
        } else if (letra.equals("V") || (letra.equals("v"))) {
            System.out.println("Boa tarde!");
        } else if (letra.equals("N") || (letra.equals("n"))) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }
        scanner.close();
    }
}
