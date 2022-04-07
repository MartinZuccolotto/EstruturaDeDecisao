package com.company;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a primeira nota do aluno: ");
        Double primeiraNota = scanner.nextDouble();
        System.out.print("Insira a segunda nota do aluno: ");
        Double segundaNota = scanner.nextDouble();
        Double mediaDasNotas = (primeiraNota + segundaNota) / 2;
        boolean mediaEntreNoveEDez = mediaDasNotas > 9 && mediaDasNotas <= 10;
        boolean mediaEntreSeteMeioENove = mediaDasNotas > 7.5 && mediaDasNotas <= 9;
        boolean mediaEntreSeisESeteEMeio = mediaDasNotas > 6 && mediaDasNotas <= 7.5;
        boolean mediaEntreQuatroESeis = mediaDasNotas > 4 && mediaDasNotas <= 6;
        boolean mediaEntreZeroEQuatro = mediaDasNotas > 0 && mediaDasNotas <= 4;
        System.out.println("==========================");
        if (mediaEntreNoveEDez) {
            System.out.println("Primeira nota foi: "+primeiraNota+"\n Segunda nota foi: "+segundaNota+"\n Sua media foi: "+mediaDasNotas+"\n Sua nota foi A.");
        } else if (mediaEntreSeteMeioENove) {
            System.out.println("Primeira nota foi: "+primeiraNota+"\n Segunda nota foi: "+segundaNota+"\n Sua media foi: "+mediaDasNotas+"\n Sua nota foi B.");
        } else if (mediaEntreSeisESeteEMeio) {
            System.out.println("Primeira nota foi: "+primeiraNota+"\n Segunda nota foi: "+segundaNota+"\n Sua media foi: "+mediaDasNotas+"\n Sua nota foi C.");
        }  else if (mediaEntreQuatroESeis) {
            System.out.println("Primeira nota foi: "+primeiraNota+"\n Segunda nota foi: "+segundaNota+"\n Sua media foi: "+mediaDasNotas+"\n Sua nota foi D.");
        } else if (mediaEntreZeroEQuatro) {
            System.out.println("Primeira nota foi: "+primeiraNota+"\n Segunda nota foi: "+segundaNota+"\n Sua media foi: "+mediaDasNotas+"\n Sua nota foi E.");
        } else {
            System.out.println("!!!!ERRO!!!!");
        }

    }
}
