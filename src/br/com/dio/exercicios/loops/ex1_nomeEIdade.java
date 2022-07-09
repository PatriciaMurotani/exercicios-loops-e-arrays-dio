package br.com.dio.exercicios.loops;
import java.util.Scanner;

/*
Nome e Idade: Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome).
Nota: Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e
continue pedindo até que o usuário informe um valor válido.
*/
public class ex1_nomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;


        while (true) {
            System.out.println("Insira o nome do aluno: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Insira a idade do aluno: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");
    }
}