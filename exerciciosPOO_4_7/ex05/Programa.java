package exerciciosPOO.ex05;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Usuario john = new Usuario();
        Usuario jane = new Usuario();

        System.out.println("Vamos criar um sistema com opções");
        System.out.print("Informe o número de 1 a 8: ");
        System.out.println("Sendo");
        System.out.println(
                "1 - Cadastrar Usuario A\n" +
                "2 - Cadastrar Usuario B\n" +
                "3 - Lancamentos Usuario A\n" +
                "4 - Lancamentos Usuario B\n" +
                "5 - Transferir Usuario A para B\n" +
                "6 - Transferir Usuario B para A\n" +
                "7 - Imprimir informacoes Usuarios\n" +
                "8 - Sair");
        int operacaoSelecionada = entrada.nextInt(); entrada.nextLine();

        while (true) {
            if(operacaoSelecionada < 1 || operacaoSelecionada > 8) {
                System.out.println("Opcao invalida");
            }else if (operacaoSelecionada == 1){
                System.out.println("Cadasrtando Usuario A");
                john.nome = "Jon Doe";
                john.idade = 36;
                john.genero = "Masculino";
                john.cpf = "044.906.274.09";
                john.salario = 1500.00;
            }else if (operacaoSelecionada == 2){
                System.out.println("Cadasrtando Usuario B");
                jane.nome = "Jane Doe";
                jane.idade = 29;
                jane.genero = "Feminino";
                jane.cpf = "024.666.274.09";
                jane.salario = 2500.00;
            }else if (operacaoSelecionada == 3){
                System.out.println("Lancamentos usuario A");
                john.realizarLancamento(100, "CREDITO", "HORA EXTRA do MES");
                john.realizarLancamento(500, "DEBITO", "PLANO DE SAUDE");
            }else if (operacaoSelecionada == 4){
                System.out.println("Lancamentos usuario B");
                jane.realizarLancamento(150, "CREDITO", "HORA EXTRA do MES");
                jane.realizarLancamento(800, "DEBITO", "PLANO DE SAUDE");
            } else if (operacaoSelecionada == 5) {
                System.out.println("Transferindo para usuario B");
                john.transferirPara(jane, 250.00);
            } else if (operacaoSelecionada == 6) {
                System.out.println("Transferindo para usuario A");
                jane.transferirPara(john, 350.00);
            }else if (operacaoSelecionada == 7){
                System.out.println("Imprimindo insofrmacoes");
                john.imprimirInformacoes();
                jane.imprimirInformacoes();
            }

            System.out.println(" ");
            System.out.println("Ainda temos algo a fazer? ou digite 5 pra sair.");
            System.out.println(
                    "1 - Cadastrar Usuario A\n" +
                    "2 - Cadastrar Usuario B\n" +
                    "3 - Lancamentos Usuario A\n" +
                    "4 - Lancamentos Usuario B\n" +
                    "5 - Transferir Usuario A para B\n" +
                    "6 - Transferir Usuario B para A\n" +
                    "7 - Imprimir informacoes Usuarios\n" +
                    "8 - Sair");
            operacaoSelecionada = entrada.nextInt(); entrada.nextLine();

            if(operacaoSelecionada == 8){
                entrada.close();
                break;
            }
        }
    }
}
