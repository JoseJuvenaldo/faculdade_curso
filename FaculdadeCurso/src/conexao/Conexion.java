/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JUVENALDO
 */
public class Conexion {

    private Connection conexao;
    private String url = "jdbc:mysql://localhost/fc";
    private String usuario = "root";
    private String senha = "";

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public void estabelecerConexao() {

        try {
            Class.forName("jdbc:mysql://localhost/fc");
            try {
                conexao = DriverManager.getConnection(url, usuario, senha);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void encerrarConexao() {
        try {
            conexao.close();
        } catch (Exception e) {

            //caso tenha algum problema dentro do try ele vai para o catch.
            // para saber qual foi o erro que deu usar o metodo
            //printStackTrace() que tem dentro das classes "Exception"
            e.printStackTrace();
        }
    }

    //Statement é uma interface utilizada para executar instruções SQL.
    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
