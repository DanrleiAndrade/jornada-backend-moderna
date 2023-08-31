package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public static Connection getConnection(){
        try{
            final String url = "jdbc:postgresql://localhost:5432/postgres";
            final String usuario = "postgres";
            final String senha = "123";
            System.out.println("Conexão efetuada com sucesso.");
            return DriverManager.getConnection(url, usuario, senha);
        }catch (SQLException e){
            throw new RuntimeException("Erro ao tentar conectar" + e);
        }
    }

}
