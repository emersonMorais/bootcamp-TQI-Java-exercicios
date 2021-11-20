package br.com.dio.exercicios.arrays;

/*
* Crie um veto de 6 números inteiros e mostreos em ordem inversa
* */

public class Main {

    public static void main(String[] args) {
        int[] vectorNumbers = {3, 5, 78, 90, 34, 7};
        for(int i = vectorNumbers.length-1; i >= 0; i--){
            System.out.println(vectorNumbers[i]);
        }
    }
}
