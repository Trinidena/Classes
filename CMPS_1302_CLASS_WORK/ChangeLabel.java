import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.fxml.*;
import java.io.IOException;

public class ChangeLabel extends Application {
   public void start(Stage stage) throws IOException {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("ChangeLabelFXML.fxml"));
      Parent root = loader.load();

      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("Label Changer");
      stage.show();
   }
}