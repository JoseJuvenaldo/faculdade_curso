/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JUVENALDO
 */
public class LoginController implements Initializable {

    @FXML
    private TextField TextFieldusuario;

    @FXML
    private PasswordField TextFildSenha;

    @FXML
    private Button BtnEntrar;

    @FXML
    private Button BtnCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        BtnEntrar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                if (TextFieldusuario.getText().equals("ifpi") && TextFildSenha.getText().equals("123")) {

                    Stage stage = new Stage();
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(getClass().getResource("MenuAdministrativo.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //INICIO DO BLOCO TESTE
                    //FIM DO BLOCO TESTE
                    Scene scene = new Scene(root);

                    stage.setScene(scene);
                    stage.show();
                    //  stage.setTitle("Administração");

                    BtnEntrar.getScene().getWindow().hide();

                    Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
                    alerta.setTitle("FACULDADE/CURSO!");
                    alerta.setHeaderText("MENU DE EDIÇÃO ADMINISTRATIVA");
                    alerta.show();

                    //} else {
                    //  Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("FACULDADE/CURSO!");
                    alerta.setHeaderText("Usuário ou senha incorreto...");
                    alerta.show();

                }

            }
        });

        BtnCancelar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }

        });
    }
}
