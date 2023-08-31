package view;

import model.ProdutoDAO;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String [] args) throws SQLException {

        Scanner scan = new Scanner(System.in);

        System.out.println("ESCOLHA UMA OPCAO ABAIXO");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Atualizar Produto");
        System.out.println("3 - Excluir Produto");
        System.out.println("4 - Listar Produto");

        int num1 = scan.nextInt();scan.nextLine();

        while (num1 > 4 || num1 < 1){
            System.out.println("DADO INVÁLIDO! Escolha uma opção de 1 a 4:");
            num1 = scan.nextInt();scan.nextLine();
        }

        switch (num1){
            case 1:
                ProdutoDAO.cadastrarProduto();
                break;

            case 2:
                ProdutoDAO.atualizarProduto();
                break;

            case 3:
                ProdutoDAO.excluirProduto();
                break;

            case 4:
                ProdutoDAO.listarProduto();
                break;

            default:
                System.out.println("DADO INVÁLIDO! Escolha uma opção de 1 a 4:");
        }
    }

}
