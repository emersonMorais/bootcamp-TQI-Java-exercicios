package br.com.dio.exercicios.loops;

/*
* Faça um programa que leia 5 números, informe o maior e a média deles.
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers;
        int counter = 0;
        int bigger = 0;
        int sum = 0;
        int media = 0;

        do {
            System.out.println("Digite um número: ");
            numbers = scan.nextInt();
            if(numbers > bigger)
                bigger = numbers;

            media = (sum += numbers)/5;
            counter++;

        }while(counter < 5);

        System.out.println(" ");
        System.out.println("Maior número: " + bigger );
        System.out.println("Media: " + media);
    }
}
