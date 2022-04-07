package com.company;

import java.util.Scanner;
//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a primeira nota do aluno: ");
        double primeiraNota = scanner.nextDouble();
        System.out.print("Insira a segunda nota do aluno: ");
        double segundaNota = scanner.nextDouble();
        double mediaDoAluno = (primeiraNota + segundaNota) / 2;
        boolean mediaMaiorOuIgualASete = mediaDoAluno >= 7 && mediaDoAluno < 10;
        boolean mediaMenorQueSete = mediaDoAluno < 7;
        boolean mediaIgualADez = mediaDoAluno == 10;
        if (mediaMaiorOuIgualASete) {
            System.out.println("O aluno está Aprovado!!");
        } else if (mediaMenorQueSete) {
            System.out.println("O aluno está Reprovado!!");
        } else if (mediaIgualADez) {
            System.out.println("O aluno foi Aprovado com Distinção.");
        }
        else {
            System.out.println("Nota inválida!!");
        }
        scanner.close();
    }
}
