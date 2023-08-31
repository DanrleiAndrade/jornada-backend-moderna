package ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int repeticoes;
        int controle;

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.println("Digite a quantidade de repetições: ");
        repeticoes = scan.nextInt(); scan.nextLine();
        scan.close();

        controle = 0;

        while (controle <= (repeticoes - 1)){
            System.out.println(controle + " - " + nome);
            controle++;
        }

    }
}
