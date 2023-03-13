import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Paint extends Application
{
   public void start(Stage stage) throws IOException {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("Paint.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setFullScreen(true);
      stage.setTitle("Paint");
      stage.show();
   }

}