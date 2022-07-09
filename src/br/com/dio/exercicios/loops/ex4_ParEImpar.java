package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Par e Ímpar: Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a
quantidade de números impares.
 */
public class ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Qual a quantidade de números? ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("A quantidade de números pares é: " + quantPares);
        System.out.println("A quantidade de números ímpares é: " + quantImpares);

    }
}
