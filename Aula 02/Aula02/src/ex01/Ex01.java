package ex01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        String cpf;
        String genero;
        String email;
        String telefone;
        String rua;
        String numeroEnd;
        String bairro;
        String cidade;


        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.println("Digite sua idade: ");
        idade = scan.nextInt(); scan.nextLine(); //SEMPRE APÓS UM "nextInt", "nextDouble".... USAR UM "nextLine" PARA EVITAR BUGS.
        System.out.println("Digite seu CPF (___.___.___-__): ");
        cpf = scan.nextLine();
        System.out.println("Digite seu gênero (M-F): ");
        genero = scan.nextLine();
        System.out.println("Digite seu email: ");
        email = scan.nextLine();
        System.out.println("Digite seu telefone ((xx) xxxxx-xxxx): ");
        telefone = scan.nextLine();
        System.out.println("Digite sua rua: ");
        rua = scan.nextLine();
        System.out.println("Digite o número do seu endereço: ");
        numeroEnd = scan.nextLine();
        System.out.println("Digite seu bairro: ");
        bairro = scan.nextLine();
        System.out.println("Digite sua cidade: ");
        cidade = scan.nextLine();
        scan.close();

        System.out.println("######## FORMULÁRIO MODERNA #########");
        System.out.println("Nome: " + nome + " Idade: " + idade);
        System.out.println("CPF: " + cpf + " Gênero: " + genero);
        System.out.println("Email: " + email + " Tel: " + telefone);
        System.out.println("------------- Endereço -------------");
        System.out.println("Nº: " + numeroEnd + " Rua: " + rua);
        System.out.println("Bairro: " + " Cidade: " + cidade);
        System.out.println("#####################################");


    }

}
