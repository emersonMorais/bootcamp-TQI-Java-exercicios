package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores:
 * nome e idade;
 * Pare o programa ao digitar 0
 * */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while(true) {
            System.out.println("Digite o nome: ");
            name = scan.next();
            if(name.equals("0"))
                break;
            System.out.println("Digite a idade: ");
            age = scan.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
