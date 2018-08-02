/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JUVENALDO
 */
public class CursoController {

    @FXML
    private Button btnVoltarMenuAdministrativo;

    @FXML
    private Button BtnCancelar;

    @FXML
    private Button btnTrocaTela;

    @FXML
    private ListView<Curso> listViewCurso;

    @FXML
    private Button btnInserir;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textFildNomeDoCurco;

    @FXML
    public void initialize(URL location, ResourceBundle rs) {
        //assert textFildNomeDoCurco != null : "fx:id=\"textFildNomeDoCurco\" was not injected: check your FXML file 'CursoCadastro.fxml'.";
        // textFildNomeDoCurco.setc(new PropertyValueFactory<>("nome"));
        atualisaList();
    }

    @FXML
    private void btnInserir(ActionEvent e) throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("CursoCadastro.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        btnTrocaTela.getScene().getWindow().hide();

        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("FACULDADE/CURSO!");
        alerta.setHeaderText("Tela de cadastramento de cursos");
        alerta.show();

    }

    /**
     * @author José Juvenaldo
     * @author Ronaldo Silva
     *
     */
    private void atualisaList() {
        //Limpa a lista no banco de dados para que possa atualizar
        listViewCurso.getItems().clear();
        //  for (Curso curso : Curso.all()) {
        //  listViewCurso.getItems().add(curso);
        //}
    }

    //Comando para cancelar a janela em execução
    public void cancelarExecucao() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("CursoApresentacao.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        BtnCancelar.getScene().getWindow().hide();

    }

    public void voltarParaMenuAdministrativo() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("MenuAdministrativo.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        btnVoltarMenuAdministrativo.getScene().getWindow().hide();

    }

}
