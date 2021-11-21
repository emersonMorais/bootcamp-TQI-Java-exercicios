package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
* Faça um programa que leia 20 números inteiros aleatórios(entre 0 e 100) armazene-os em um vetor.
* Ao final mostre o número e seus sucessores.
* */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[] vectorNumbers = new int[20];

        for(int i = 0; i < vectorNumbers.length; i++ ) {
            int randomNumbers = random.nextInt(100);
            vectorNumbers[i] = randomNumbers;
        }

        System.out.println("Números aleatórios e seus sucessores: ");
        for(int number : vectorNumbers) {
            System.out.println(number);
            System.out.println(number+1);
        }
    }
}
