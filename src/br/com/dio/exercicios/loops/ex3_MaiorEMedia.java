package br.com.dio.exercicios.loops;

import java.util.Scanner;
/*
Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
*/
public class ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Insira um número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("O maior número é:" + maior);
        System.out.println("A média é igual a: " + soma/5);

    }
}
