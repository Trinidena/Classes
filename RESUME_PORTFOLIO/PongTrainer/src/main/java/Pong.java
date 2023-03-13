import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Pong.
 */
public class Pong extends Application {
    public void start(Stage stage) throws IOException {
        HighScoreModel model = new HighScoreModel(0, 0);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OpenScene.fxml"));
        Parent root = loader.load();
        ((OpenSceneController) loader.getController()).setModel(model);
        //loader.<OpenSceneController>getController().setModel(model);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Pong Trainer 9000");
        stage.show();
    }
}