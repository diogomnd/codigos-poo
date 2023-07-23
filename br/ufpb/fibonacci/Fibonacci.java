package br.ufpb.fibonacci;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a posição do elemento? ");
        int posicao = input.nextInt();

        // Substitua N pelo número dos métodos
        System.out.printf("O elemento da posição %s é: %s", posicao, fibonacciN(posicao) + "\n");

        System.out.print("Os " + (posicao + 1) + " primeiros elementos da sequência de fibonacci são:");
        for (int i = 0; i < (posicao + 1); i++) {
            System.out.print(" " + fibonacciN(i));
        }

        input.close();
    }

    public static int fibonacci1(int posicao) {
        if (posicao == 0 || posicao == 1) {
            return posicao; // Os números de fibonacci coincidem com as posições 0 e 1
        }

        int penultimo = 0;
        int ultimo = 1;

        int atual = 0;
        for (int i = 2; i <= posicao; i++) {
            atual = penultimo + ultimo;
            penultimo = ultimo;
            ultimo = atual;
        }
        return atual;
    }

    public static int fibonacci2(int posicao) {
        if (posicao == 0 || posicao == 1) {
            return posicao; // Os números de fibonacci coincidem com as posições 0 e 1
        }

        int penultimo = 0;
        int ultimo = 1;

        int atual = 0;
        int i = 2;
        while (i <= posicao) {
            atual = penultimo + ultimo;
            penultimo = ultimo;
            ultimo = atual;
            i++;
        }
        return atual;
    }

    public static int fibonacci3(int posicao) {
        if (posicao == 0 || posicao == 1) {
            return posicao; // Os números de fibonacci coincidem com as posições 0 e 1
        }

        return fibonacci3(posicao - 1) + fibonacci3(posicao - 2);
    }

}
