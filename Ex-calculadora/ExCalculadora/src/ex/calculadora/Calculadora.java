package ex.calculadora;

public class Calculadora {
    public static void main(String[] args) {

        double num1;
        double num2;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;
        double resto;

        num1 = 75d;
        num2 = 2.4d;

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        resto = num1 % num2;

        System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + soma);
        System.out.println("A subtração de " + num1 + " e " + num2 + " é igual a " + subtracao);
        System.out.println("A multiplicação de " + num1 + " e " + num2 + " é igual a " + multiplicacao);
        System.out.println("A divisão de " + num1 + " e " + num2 + " é igual a " + divisao);
        System.out.println("O resto de " + num1 + " e " + num2 + " é igual a " + resto);

    }
}
