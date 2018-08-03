package controle;

import conexao.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public class CursoPrincipal {

    private IntegerProperty id;
    private StringProperty nome;

    public CursoPrincipal(IntegerProperty id, StringProperty nome) {
        this.id = id;
        this.nome = nome;
    }

    public IntegerProperty getId() {
        return id;
    }

    public void setId(IntegerProperty id) {
        this.id = id;
    }

    public StringProperty getNome() {
        return nome;
    }

    public void setNome(StringProperty nome) {
        this.nome = nome;
    }

    /**
     *
     * @param conexao VARIÁVEL INICIADORA PARA A BASE DE DADOS
     * @param lista VASCULHA AS INFORMAÇÕES NA BASE DE DADOS MYSQL E IMPRIME NA
     * TELA
     */
    public static void listarInformacoes(Conexion conexao, ObservableList<CursoPrincipal> lista) {
        /*
        try {
            Statement statement = conexao.createStatement();//verificar
            ResultSet rs = conexao.createStatement().executeQuery("select CURSO_ID, NOME from curso");
            while (rs.next()) {
                // lista.add(new CursoPrincipal(rs.getInt("CURSO_ID"), rs.getString("NOME")));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         */
    }

    /**
     * APRESENTAÇÃO DA CAPTURA DE INFORMAÇÕES
     *
     * @return
     */
    @Override
    public String toString() {
        return id.get() + " ( " + nome.get() + " )";
    }

}
