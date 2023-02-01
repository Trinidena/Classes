import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class WebView extends Application
{
   @Override
   public void start(Stage stage) throws IOException
   {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("WebView.fxml"));
      Parent root = loader.load();
      Controller controller = loader.getController();
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("WebView");
      stage.show();
   }
}