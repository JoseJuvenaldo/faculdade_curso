/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JUVENALDO
 */
public class EstadoController implements Initializable {

    private Button btnCancelar;

    private Button btnNovaJanela;
    @FXML
    private Button btnMenuEstado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void cancelarExecucao() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("MenuAdministrativo.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        btnCancelar.getScene().getWindow().hide();

    }

    @FXML
    public void telaEstadoPrincipal() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("../View/EstadoCadastro.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        btnNovaJanela.getScene().getWindow().hide();

    }

    @FXML
    public void telaEstado() throws IOException {

        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("Estado.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //Fecha a janela inicial e exibe a próxima
        btnMenuEstado.getScene().getWindow().hide();

    }

}
