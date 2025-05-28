
package conexaobd01;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexaoBD01 {

     public static Connection conectar() {
    Connection conexao = null;
    String url = "jdbc:mysql://localhost:3306/db_teste";
    String user = "root";
    String password = "";

    try {
        conexao = DriverManager.getConnection(url, user, password);
        System.out.println("conexão estabelecida com sucesso");
    } catch (SQLException e) {
        System.out.println("Erro ao conectar");
    }

    return conexao;
}

public static void criarTabela() {
    String sql = "CREATE TABLE IF NOT EXISTS clientes(" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "nome VARCHAR(100) NOT NULL," +
            "email VARCHAR(100) UNIQUE," +
            "senha VARCHAR(50) NOT NULL" +
            ")";
}

public static void main(String[] args) {
    
}
}
// Link do mysql ==> 🔗 https://dev.mysql.com/downloads/connector/j/
