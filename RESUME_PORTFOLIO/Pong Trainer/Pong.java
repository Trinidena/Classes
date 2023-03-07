import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Pong extends Application
{
   public void start(Stage stage) throws IOException
   {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("OpenSceneFXML.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      stage.setScene(scene);
      //stage.setFullScreen(true);
      stage.setTitle("Pong Trainer 9000");
      stage.show();
   }
}