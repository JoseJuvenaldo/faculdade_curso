/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author JUVENALDO
 * @author RONALDO
 *
 * CLASSE PARA ESTABELECER CONEXÃO COM BANCO DE DADOS
 */
public class Conexao {

    Connection conn = null;

    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/fc", "root", "");
            return conn;
        } catch (Exception e) {
            //System.out.Println("erro...");
            return null;
        }
    }

    public Object createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
