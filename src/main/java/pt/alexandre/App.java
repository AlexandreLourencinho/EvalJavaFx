package pt.alexandre;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import pt.alexandre.gui.menu.MenuController;

import java.io.IOException;
import java.util.Objects;

public class App extends Application
{
    public static Stage stage;

    public static Scene scene;


    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(MenuController.class.getResource("menu.fxml")));
            scene = new Scene(root);
            stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("Menu des exercices");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur - start");
            alert.setContentText("Problème au démarrage du programme. Contactez un administrateur");
            alert.showAndWait();
        }

    }
}
