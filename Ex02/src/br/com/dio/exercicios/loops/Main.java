package br.com.dio.exercicios.loops;
/*
* Faça um programa que receba uma nota entre 0 e 10.
* Caso o número seja inválido, solicitar que digite novamente, até que o número seja válido.
* Então encerrar o programa.
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade;

        System.out.println("Digite um número entre 0 e 10: ");
        grade = scan.nextInt();

        while(grade < 0 | grade > 10 ) {
            System.out.println("Número inválido, Tente novamente");
            grade = scan.nextInt();
        }

    }
}
