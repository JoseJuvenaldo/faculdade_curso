/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidades.Faculdade;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JUVENALDO
 */
public class FaculdadePrincipalController implements Initializable {

    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnExcluir;
    @FXML
    private Button btnAlterar;
    @FXML
    private Button btnCadastrar;
    @FXML
    private TableView<?> tablela;
    @FXML
    private TableColumn<?, ?> tableColumnId;
    @FXML
    private TableColumn<?, ?> tableColumnFaculdade;

    /* @FXML
    private TableView<Faculdade> tablela;
    @FXML
    private TableColumn<?, ?> tableColumnId;
    @FXML
    private TableColumn<?, ?> tableColumnFaculdade;
     */
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void novoCadastroInstituicao() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("../View/FaculdadeCadastro.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        btnCadastrar.getScene().getWindow().hide();

    }

    @FXML
    public void voltarMenuAdministrativo() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("MenuAdministrativo.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        btnCancelar.getScene().getWindow().hide();
    }

    @FXML
    private void telaCadastraInstituicao(ActionEvent event) {
    }
}
