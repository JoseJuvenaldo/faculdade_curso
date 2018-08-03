package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public final class ConexaoBanco {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String NOME = "fc";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String SERVIDOR = "localhost";
    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        if (connection == null) {
            // Carregando o Driver do MySQL

            Class.forName(DRIVER);
            connection = DriverManager
                    .getConnection("jdbc:mysql://" + SERVIDOR + "/" + NOME, USUARIO, SENHA);
        }
        return connection;

    }

    public static PreparedStatement connection(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Connection connection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
