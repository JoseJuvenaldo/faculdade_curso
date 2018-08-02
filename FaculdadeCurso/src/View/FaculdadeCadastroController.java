/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JUVENALDO
 */
public class FaculdadeCadastroController implements Initializable {

    @FXML
    private Button btnTelaFaculdade;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /*
    public void voltarParaMenuFaculdade() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("FaculdadeCadastro.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        btnTelaFaculdade.getScene().getWindow().hide();

    }

    @FXML
    private void retornarFaculdadePrincipal(ActionEvent e) throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("FaculdadePrincipal.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        btnTelaFaculdade.getScene().getWindow().hide();
    }
     */
    public void cancelarExecucao() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("MenuAdministrativo.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        btnTelaFaculdade.getScene().getWindow().hide();

    }

}
