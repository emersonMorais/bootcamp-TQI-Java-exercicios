package br.com.dio.exercicios.arrays;

import java.util.Scanner;

/*
* Faça um programa q leia um vetor de 6 caracteres
* e retorne quantas consoantes foram lidas.
* Imprima as consoantes.
* */
public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String[] vectorConsonants = new String[6];
            int qtdConsonants = 0;

            for(int i = 0; i < vectorConsonants.length; i++){
                    System.out.println("Dgite uma letra: ");
                    String letter = scan.next();

                if (!(letter.equalsIgnoreCase("a") |
                        letter.equalsIgnoreCase("e") |
                        letter.equalsIgnoreCase("i") |
                        letter.equalsIgnoreCase("o") |
                        letter.equalsIgnoreCase("u"))) {
                    qtdConsonants++;
                    vectorConsonants[i] = letter;
                }
            }

            for(String consonant : vectorConsonants )
                if (consonant != null)
                    System.out.println(consonant);

          System.out.println(qtdConsonants);
        }
    }
