package com.exercicios.S01;

import java.util.Scanner;

/*
 * A sua empresa resolveu dar um aumento de salário aos seus funcionários e te pediram para 
 * desenvolver o programa que calculará os reajustes.

    a. Faça um programa que recebe o salário de um funcionário e o reajuste segundo o seguinte critério,
     baseado no salário atual;
    b. Salários até R$ 1200,00 (incluindo): aumento de 20%;
    c. Salários entre R$ 1200,00 e R$1700,00: aumento de 15%;
    d. Salários entre R$ 1700,00 e R$ 2500,00: aumento de 10%;
    e. Salários de R$ 2500,00 em diante: aumento de 5%

Após o aumento ser realizado; informe na tela;

    a. O salário antes do reajuste;
    b. O percentual de aumento aplicado;
    c. O valor do aumento;
    d. O novo salário, após o aumento.
 */
public class ExercicioS01Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Calcula Reajuste 1.0 ===");
        System.out.println();

        double novoSalario = 0;
        double porcentagem = 0;
        
        System.out.println("Digite o salário atual:");
        double salario = sc.nextDouble();

        if(salario <= 1200) {
            porcentagem = (salario * 20) / 100;
            novoSalario = salario + porcentagem;
            System.out.println("Seu salário atual é de: " + salario +
            " e por isto você receberá um reajuste de 20%. O valor do aumento é de " + porcentagem + ", e seu novo salário é de: " + novoSalario +
            ".");
        } else if (salario > 1200 & salario <= 1700) {
            porcentagem = (salario * 15) / 100;
            novoSalario = salario + porcentagem;
            System.out.println("Seu salário atual é de: " + salario +
            " e por isto você receberá um reajuste de 15%. O valor do aumento é de " + porcentagem + ", e seu novo salário é de: " + novoSalario +
            ".");
        } else if (salario > 1700 & salario <= 2500) {
            porcentagem = (salario * 10) / 100;
            novoSalario = salario + porcentagem;
            System.out.println("Seu salário atual é de: " + salario +
            " e por isto você receberá um reajuste de 10%. O valor do aumento é de " + porcentagem + ", e seu novo salário é de: " + novoSalario +
            ".");
        } else {
            porcentagem = (salario * 5) / 100;
            novoSalario = salario + porcentagem;
            System.out.println("Seu salário atual é de: " + salario +
            " e por isto você receberá um reajuste de 5%. O valor do aumento é de " + porcentagem + ", e seu novo salário é de: " + novoSalario +
            ".");
        }

        sc.close();
    }
}
