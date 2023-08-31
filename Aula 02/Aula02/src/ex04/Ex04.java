package ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double num1;
        double num2;
        double soma;
        double multiplicacao;
        String resultado;

        System.out.println("||==========ModernApp de cálculo=========||");
        System.out.println("Digite o primeiro valor:");
        num1 = scan.nextDouble();scan.nextLine();
        System.out.println("Digite o segundo valor:");
        num2 = scan.nextDouble();scan.nextLine();
        scan.close();

        soma = num1 + num2;
        multiplicacao = num1 * num2;
        resultado = (soma == multiplicacao ? "A soma é igual a multiplicação." : "A soma não é igual a multiplicação.");

        System.out.println("O valor da soma é: " + soma + " -- E o valor da multiplicação é: " + multiplicacao);
        System.out.println(resultado);

    }
}
