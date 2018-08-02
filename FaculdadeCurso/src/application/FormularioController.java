/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

//import conexao.Conexao;
import conexao.Conexion;
import controle.CursoPrincipal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author JUVENALDO
 */
public class FormularioController implements Initializable {

    @FXML
    private ToggleGroup GrupoGenero;
    @FXML
    private Button btnCancelar;
    /*
    @FXML
    private ComboBox<?> comBoxUf;
    @FXML
    private ComboBox<?> comBoxCurso;
    @FXML
    private ComboBox<?> comBoxFaculdade;
     */
    @FXML
    private ComboBox<CursoPrincipal> comBoxCurso;
    private ObservableList<CursoPrincipal> listarCursos;
    private Conexion conexao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        conexao = new Conexion();
        conexao.estabelecerConexao();
        listarCursos = FXCollections.observableArrayList();
        CursoPrincipal.listarInformacoes((Conexion) conexao.getConexao(), listarCursos);//revisar
        //ComboBox recebe a lista
        comBoxCurso.setItems(listarCursos);

        conexao.encerrarConexao();
    }

}
