package br.com.dio.exercicios.loops;
/*
* Desenvolva um gerador de tabuada de qualquer número inteiro entre 1 e 10.
*O usuário deve informar qual número ele deseja ver a tabuada.
*
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int timesTables, result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja ver a tabuada: ");
        timesTables = scan.nextInt();

        for(int i = 1; i <= 10; i++) {
            result = timesTables * i;
            System.out.println(timesTables + " * " + i + " = " + result );
        }

    }
}
