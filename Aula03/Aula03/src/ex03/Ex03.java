package ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = null;
        String sexo = null;
        int idade = 0;
        int anoNascimento = 0;
        String rua = null;
        String bairro = null;
        String cep = null;
        String numero = null;
        int opcaoMenu;

        System.out.println("----------BEM-VINDO AO SISTEMA DE CADASTRO----------");
        System.out.println("Digite o número da opção desejada: ");
        System.out.println("(1) - Cadastro aluno");
        System.out.println("(2) - Cadastro Endereço");
        System.out.println("(3) - Imprimir Aluno");
        System.out.println("(4) - Imprimir Endereço");
        System.out.println("(5) - Sair");

        opcaoMenu = scan.nextInt(); scan.nextLine();

        while (true){
            if (opcaoMenu < 1 || opcaoMenu > 5){
                System.out.println("Opção informada inválida!");
            }

            if (opcaoMenu == 5){
                break;
            } else if (opcaoMenu == 1) {
                System.out.println("Cadastrando um aluno-------");
                System.out.println("Informe o nome:");
                nome = scan.nextLine();
                System.out.println("Informe a idade:");
                idade = scan.nextInt();scan.nextLine();
                System.out.println("Informe o sexo:");
                sexo = scan.nextLine();
                System.out.println("Informe o ano de nascimento:");
                anoNascimento = scan.nextInt();scan.nextLine();
            } else if (opcaoMenu == 2) {
                System.out.println("Cadastrando endereço-------");
                System.out.println("Digite a rua:");
                rua = scan.nextLine();
                System.out.println("Digite o número:");
                numero = scan.nextLine();
                System.out.println("Digite o bairro:");
                bairro = scan.nextLine();
                System.out.println("Digite o CEP:");
                cep = scan.nextLine();
            } else if (opcaoMenu == 3) {
                System.out.println("###### ALUNO ######");
                System.out.printf("Nome: %s -- Idade: %s\n", nome, idade);
                System.out.printf("Sexo: %s -- A. de Nasc.: %s\n", sexo, anoNascimento);
            } else if (opcaoMenu == 4) {
                System.out.println("###### ENDEREÇO ######");
                System.out.printf("Rua: %s -- Nº: %s\n", rua, numero);
                System.out.printf("Bairro: %s -- CEP: %s\n", bairro, cep);
            }

            System.out.println("Ainda temos algo a fazer?");
            System.out.println(" ");
            System.out.println("(1) - Cadastro aluno\n" +
                    "(2) - Cadastro Endereço\n" +
                    "(3) - Imprimir Aluno\n" +
                    "(4) - Imprimir Endereço\n" +
                    "(5) - Sair");

            opcaoMenu = scan.nextInt();scan.nextLine();

        }

        scan.close();
    }
}
