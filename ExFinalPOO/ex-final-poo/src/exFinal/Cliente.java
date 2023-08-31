package exFinal;

import java.util.Scanner;

public class Cliente {

    Scanner scan = new Scanner(System.in);

    protected static int numeroPedidos;
    private int numeroSenha = 0;
    private String nome;
    private String cpf;
    private String nomeCadastro;
    private String cpfCadastro;


    private Cliente (){
        cadastroDadosCliente();
        this.nome = nomeCadastro;
        this.cpf = cpfCadastro;
        gerarNumeroSenha();
        System.out.printf("Bem-vindo, %s!\n", this.nome);
    }

    protected static Cliente criarCliente (){
       return new Cliente();
    }

    private void gerarNumeroSenha(){
        Cliente.numeroPedidos++;
        this.numeroSenha = numeroPedidos;
    }

    private void cadastroDadosCliente(){
        System.out.println("\nDigite seu nome: ");
        nomeCadastro = scan.nextLine();
        System.out.println("\nDigite seu CPF: ");
        cpfCadastro = scan.nextLine();
    }

    protected void reciboCliente(){
        System.out.println("\n====== Recibo do Cliente =======");
        System.out.printf("Nome: %s | CPF: %s.\n", this.nome, this.cpf);
        System.out.printf("Nº da senha: %s.\n", numeroSenha);
    }
}
