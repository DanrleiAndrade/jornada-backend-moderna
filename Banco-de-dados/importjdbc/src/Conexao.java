import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String usuario = "postgres";
        final String senha = "123";

        Connection conexao = DriverManager.getConnection(url,usuario,senha);

        System.out.println("Conexão efetuada com sucesso!");

        conexao.close();
    }
}