/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author JUVENALDO
 */
public class Curso extends Application {

    @Override
    public void start(Stage recebe) throws Exception {

        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("CursoApresentacao.fxml"));

        Scene scene = new Scene(root);

        recebe.setScene(scene);
        recebe.setResizable(false);
        recebe.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
