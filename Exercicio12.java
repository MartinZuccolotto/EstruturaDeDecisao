package com.company;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor da sua hora trabalhada: ");
        Double valorHora = scanner.nextDouble();
        System.out.print("Agora, insira a quantidade de horas trabalhadas: ");
        double horaTrab =  scanner.nextDouble();
        double salarioBruto = valorHora * horaTrab;
        if (salarioBruto <= 900) {
            double ir = (salarioBruto * 5)/100;
            double inss = (salarioBruto * 10)/100;
            double sindicato = (salarioBruto * 3)/100;
            double fgts = (salarioBruto * 11)/100;
            double totalDeDesconto = sindicato + fgts + ir + inss;
            double salarioLiquido = salarioBruto - totalDeDesconto;
            System.out.print("==============================================\n");
            System.out.print("Salario Bruto: "+horaTrab+" * "+valorHora+" : R$"+salarioBruto+"\n");
            System.out.print("(-) IR (5%) : R$ "+ir+"\n");
            System.out.print("(-) INSS (10%) : R$ "+inss+"\n");
            System.out.print("(-) FGTS (11%) : R$ "+fgts+"\n");
            System.out.print("(-) SINDICATO (3%) : R$ "+sindicato+"\n");
            System.out.print("Total De Descontos : R$ "+totalDeDesconto+"\n");
            System.out.print("Salário Liquido : R$ "+salarioLiquido+"\n");
        }
        if ((salarioBruto > 900) && (salarioBruto <= 1500)) {
            double desconto1 = (salarioBruto * 5)/100;
            double ir = (salarioBruto * 5)/100;
            double inss = (salarioBruto * 10)/100;
            double sindicato = (salarioBruto * 3)/100;
            double fgts = (salarioBruto * 11)/100;
            double totalDeDesconto = sindicato + fgts + ir + inss + desconto1;
            double salarioLiquido = salarioBruto - totalDeDesconto;
            System.out.print("==============================================\n");
            System.out.print("Salario Bruto: "+horaTrab+" * "+valorHora+" : R$"+salarioBruto+"\n");
            System.out.print("(-) IR (5%) : R$ "+ir+"\n");
            System.out.print("(-) INSS (10%) : R$ "+inss+"\n");
            System.out.print("(-) FGTS (11%) : R$ "+fgts+"\n");
            System.out.print("(-) SINDICATO (3%) : R$ "+sindicato+"\n");
            System.out.print("(-) DESCONTO DE 5% : R$ "+desconto1+"\n");
            System.out.print("Total De Descontos : R$ "+totalDeDesconto+"\n");
            System.out.print("Salário Liquido : R$ "+salarioLiquido+"\n");
        }
        if ((salarioBruto > 1500 ) && (salarioBruto <= 2500)) {
            double desconto2 = (salarioBruto * 10)/100;
            double ir = (salarioBruto * 5)/100;
            double inss = (salarioBruto * 10)/100;
            double sindicato = (salarioBruto * 3)/100;
            double fgts = (salarioBruto * 11)/100;
            double totalDeDesconto = sindicato + fgts + ir + inss + desconto2;
            double salarioLiquido = salarioBruto - totalDeDesconto;
            System.out.print("==============================================\n");
            System.out.print("Salario Bruto: "+horaTrab+" * "+valorHora+" : R$"+salarioBruto+"\n");
            System.out.print("(-) IR (5%) : R$ "+ir+"\n");
            System.out.print("(-) INSS (10%) : R$ "+inss+"\n");
            System.out.print("(-) FGTS (11%) : R$ "+fgts+"\n");
            System.out.print("(-) SINDICATO (3%) : R$ "+sindicato+"\n");
            System.out.print("(-) DESCONTO DE 10% : R$ "+desconto2+"\n");
            System.out.print("Total De Descontos : R$ "+totalDeDesconto+"\n");
            System.out.print("Salário Liquido : R$ "+salarioLiquido+"\n");
        }
        if (salarioBruto > 2500) {
            double desconto3 = (salarioBruto * 20)/100;
            double ir = (salarioBruto * 5)/100;
            double inss = (salarioBruto * 10)/100;
            double sindicato = (salarioBruto * 3)/100;
            double fgts = (salarioBruto * 11)/100;
            double totalDeDesconto = sindicato + fgts + ir + inss + desconto3;
            double salarioLiquido = salarioBruto - totalDeDesconto;
            System.out.print("==============================================\n");
            System.out.print("Salario Bruto: "+horaTrab+" * "+valorHora+" : R$"+salarioBruto+"\n");
            System.out.print("(-) IR (5%) : R$ "+ir+"\n");
            System.out.print("(-) INSS (10%) : R$ "+inss+"\n");
            System.out.print("(-) FGTS (11%) : R$ "+fgts+"\n");
            System.out.print("(-) SINDICATO (3%) : R$ "+sindicato+"\n");
            System.out.print("(-) DESCONTO DE 20% : R$ "+desconto3+"\n");
            System.out.print("Total De Descontos : R$ "+totalDeDesconto+"\n");
            System.out.print("Salário Liquido : R$ "+salarioLiquido+"\n");
        }
        scanner.close();
    }
}
