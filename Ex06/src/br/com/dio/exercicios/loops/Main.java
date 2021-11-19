package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
* Faça um programa que calcule o faatorial de um número inteiro fornecido pelo usuário
*
* */
public class Main {

    public static void main(String[] args) {
        int number, multiplication = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja ver o resultado fatorial: " );
        number = scan.nextInt();

        for(int i = number;  i >= 1; i--){
            multiplication = multiplication * i;
        }
        System.out.println("Fatorial " + number +"! é igual a " + multiplication);
    }
}
