package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
* Gere e imprima uma matriz M 4X4 com valores  aleatórios entre 0 e 9
*
* */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] Matrix = new int[4][4];

        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[i].length; j++){
                Matrix[i][j] = random.nextInt(9);
            }
        }

        for(int[] row : Matrix) {
            for(int column : row) {
                System.out.print(column + " ");
            }
            System.out.println(" ");
        }

    }
}
