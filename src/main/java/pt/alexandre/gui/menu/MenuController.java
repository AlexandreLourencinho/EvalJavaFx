package pt.alexandre.gui.menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class MenuController
{
    public Stage stagefen = new Stage();

    /**
     *
     */
    public void fenEval()
    {
        try {
            Parent root =
                    FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../gestionTableClient/tableClient" +
                            ".fxml")));
            Scene scene = new Scene(root);
            stagefen.setTitle("Eval JavaFx");
            stagefen.setScene(scene);
            stagefen.show();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur FXML");
            alert.setContentText("Il y a eu un problème lors de l'ouverture de la fenêtre.");
            alert.showAndWait();
        }
    }
}
