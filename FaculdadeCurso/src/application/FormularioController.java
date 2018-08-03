/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import conexao.Conexion;
import controle.CursoPrincipal;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author RONALDO
 * @author JUVENALDO
 */
public class FormularioController implements Initializable {

    @FXML
    private Button btnProximo;
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

    public void cadastroEndereco() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("Endereco.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        btnProximo.getScene().getWindow().hide();

    }

    public void voltaLogin() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("../controle/Login.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        btnCancelar.getScene().getWindow().hide();

    }

}
