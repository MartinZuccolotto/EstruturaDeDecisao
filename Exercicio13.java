package com.company;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1: DOMINGO.\n2:SEGUNDA.\n3: TERÇA.\n4: QUARTA.\n5: QUINTA.\n6: SEXTA.\n7: SABADO\n");
        System.out.print("Escolha um dia da semana: ");
        double diaDaSemana = scanner.nextDouble();
        boolean diaForDomingo = diaDaSemana == 1;
        boolean diaForSegunda = diaDaSemana == 2;
        boolean diaForTerça = diaDaSemana == 3;
        boolean diaForQuarta = diaDaSemana == 4;
        boolean diaForQuinta = diaDaSemana == 5;
        boolean diaForSexta = diaDaSemana == 6;
        boolean diaForSabado = diaDaSemana == 7;
        System.out.println("=================================");
        if (diaForDomingo) {
            System.out.println("O dia escolhido foi DOMINGO.");
        } else if (diaForSegunda) {
            System.out.println("O dia escolhido foi SEGUNDA.");
        } else if (diaForTerça) {
            System.out.println("O dia escolhido foi TERÇA.");
        } else if (diaForQuarta) {
            System.out.println("O dia escolhido foi QUARTA.");
        } else if (diaForQuinta) {
            System.out.println("O dia escolhido foi QUINTA.");
        } else if (diaForSexta) {
            System.out.println("O dia escolhido foi SEXTA.");
        } else if (diaForSabado) {
            System.out.println("O dia escolhido foi SABADO.");
        } else {
            System.out.println("!!!Valor Inválido!!");
        }
        scanner.close();
    }
}
