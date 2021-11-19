package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Main {
    /*
    * Faça um programa que leia N numeros inteiros,
    * calcule e mostre a quantidade de números pares e ímpares.
    * */
    public static void main(String[] args) {
        int pairNumbers = 0, oddNumbers = 0, qtdNumbers, numbers;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de números desejados: ");
        qtdNumbers = scan.nextInt();

        for(int i = 0; i < qtdNumbers; i++ ){
            System.out.println("Digite um número: ");
            numbers = scan.nextInt();
            if(numbers % 2 == 0) {
                pairNumbers++;
            }
            else {
                oddNumbers++;
            }
        }

        System.out.println(" ");
        System.out.println("Foram armazenados " + pairNumbers + " números pares");
        System.out.println("Foram armazenados " + oddNumbers + " números ímpares");
    }
}
