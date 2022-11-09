import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Main extends Application
{
   public void start(Stage stage)
   {
      FXMLLoader loader = new FXMLLoader.load(getClass().getResource("PA13FXML.fxml"));
      
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
   }
}