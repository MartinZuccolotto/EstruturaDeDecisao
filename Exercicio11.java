package com.company;

import java.util.Scanner;
//As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
//salários até R$ 280,00 (incluindo) : aumento de 20%
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
//o salário antes do reajuste;
//o percentual de aumento aplicado;
//o valor do aumento;
//o novo salário, após o aumento.
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o seu salário: ");
        double salario = scanner.nextDouble();

        if (salario <= 280) {
            double desconto1 = (salario * 20)/100;
            double salarioTotal = desconto1 + salario;
            System.out.println("O seu salário era: "+salario+" Reais.");
            System.out.println("Mais o desconto de 20% que deu: "+desconto1+" Reais.");
            System.out.println("Seu salário ficou: "+salarioTotal+" Reais.");
        } else if ((salario > 280) && (salario < 700)) {
            double desconto2 = (salario * 15)/100;
            double salarioTotal2 = desconto2 + salario;
            System.out.println("O seu salário era: "+salario+" Reais.");
            System.out.println("Mais o desconto de 15% que deu: "+desconto2+" Reais.");
            System.out.println("Seu salário ficou: "+salarioTotal2+" Reais.");
        } else if ((salario > 700) && (salario < 1500)) {
            double desconto3 =  (salario * 10)/ 100;
            double salarioTotal3 = desconto3 + salario;
            System.out.println("O seu salário era: "+salario+" Reais.");
            System.out.println("Mais o desconto de 10% que deu: "+desconto3+" Reais.");
            System.out.println("Seu salário ficou: "+salarioTotal3+" Reais.");
        } else if ((salario > 1500)) {
            double desconto4 = (salario * 5)/100;
            double salarioTotal4 = desconto4 + salario;
            System.out.println("O seu salário era: "+salario+" Reais.");
            System.out.println("Mais o desconto de 5% que deu: "+desconto4+" Reais.");
            System.out.println("Seu salário ficou: "+salarioTotal4+" Reais.");
        }
        scanner.close();
    }
}
