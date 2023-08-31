package model;

import controller.ProdutoController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoDAO {

    public static void cadastrarProduto() throws SQLException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do produto:");
        String desc_produto = scan.nextLine();

        System.out.println("Informe a marca do produto:");
        String marca = scan.nextLine();

        System.out.println("Informe o valor do produto:");
        Double valor = scan.nextDouble();

        Connection conexao = ConexaoDAO.getConnection();

        String sql = "Insert into produto (desc_produto, marca, valor) values (?,?,?)";

        PreparedStatement pstnt = conexao.prepareStatement(sql);

        pstnt.setString(1,desc_produto);
        pstnt.setString(2,marca);
        pstnt.setDouble(3,valor);

        pstnt.execute();

        System.out.println("Produto cadastrado com sucesso!");
        pstnt.close();
        scan.close();

    }

    public static void atualizarProduto() throws SQLException{

        Scanner scan = new Scanner(System.in);

        Connection conexao = ConexaoDAO.getConnection();

        System.out.println("Digite o ID do produto a ser atualizado:");
        int id_produto = scan.nextInt();scan.nextLine();

        System.out.println("Digite o novo preço do produto:");
        Double valor = scan.nextDouble();scan.nextLine();

        String sql = "update produto set valor = ? where produto_id = ?";

        PreparedStatement pstnt = conexao.prepareStatement(sql);

        pstnt.setDouble(1,valor);
        pstnt.setInt(2,id_produto);

        pstnt.execute();

        System.out.println("Produto atualizado com sucesso!");
        pstnt.close();
        scan.close();

    }

    public static void excluirProduto() throws SQLException{
        Scanner scan = new Scanner(System.in);

        Connection conexao = ConexaoDAO.getConnection();

        System.out.println("Informe o ID do produto a ser excluído:");
        int id_produto = scan.nextInt();scan.nextLine();

        String sql = "DELETE FROM produto WHERE produto_id = ?";

        PreparedStatement pstnt = conexao.prepareStatement(sql);
        pstnt.setInt(1,id_produto);

        pstnt.execute();

        System.out.println("Produto excluído com sucesso.");

        pstnt.close();
        scan.close();
    }

    public static void listarProduto() throws SQLException{

        Connection conexao = ConexaoDAO.getConnection();

        String sql = "Select * from produto";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List< ProdutoController> produto = new ArrayList<>();

        while(resultado.next()){
            int produto_id = resultado.getInt("produto_id");
            String desc_produto = resultado.getString("desc_produto");
            String marca = resultado.getString("desc_produto");
            Double valor = resultado.getDouble("valor");
            String sn_ativo = resultado.getString("sn_ativo");

            produto.add(new ProdutoController(produto_id, desc_produto, marca, valor, sn_ativo));
        }

        for (ProdutoController p: produto){
            System.out.println(p.getProduto_id() + "  -->  " + p.getDesc_produto() + "  -->  " + p.getValor());
        }
    }

}
