package ex0304;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Usuario usuario01 = new Usuario();
        Endereco logradouro = new Endereco();
        int opcao;

        System.out.println("====== Bem-vindo ======\n" +
                "Escolha uma opção:\n" +
                "1 - Cadastrar Usuário;\n" +
                "2 - Cadastrar Endereço;\n" +
                "3 - Realizar lançamentos;\n" +
                "4 - Sair.");
        opcao = scan.nextInt();

        switch (opcao){
            case (4):
                break;
            case (1):
                System.out.println("Olá, digite o nome do usuário: ");
                usuario01.nome = scan.nextLine();
                System.out.println("Agora, digite a idade: ");
                usuario01.idade = scan.nextInt();scan.nextLine();
                System.out.println("Qual o gênero do usuário? (M ou F)");
                usuario01.genero = scan.nextLine();
                System.out.println("Digite o CPF: ");
                usuario01.cpf = scan.nextLine();
                System.out.println("Informe o salário do usuário (Ex: 1000,00):");
                usuario01.salario = scan.nextDouble();scan.nextLine();
                break;
            case (2):
                System.out.println("Digite a rua:");
                logradouro.rua = scan.nextLine();
                System.out.println("Digite o número:");
                logradouro.numero = scan.nextInt();scan.nextLine();
                System.out.println("Digite o bairro:");
                logradouro.bairro = scan.nextLine();
                System.out.println("Digite a cidade:");
                logradouro.cidade = scan.nextLine();
                break;
            case (3):
                System.out.println("case3");
                break;

        }
        scan.close();
    }
}
