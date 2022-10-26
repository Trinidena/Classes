import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class PA11 extends Application
{
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      
      Label label = new Label("JavaFX Layouts");
      
      Scene scene = new Scene(root , 600 , 400);
      
      stage.setScene(scene);
      stage.setTitle("Programming Assignment 11");
      stage.show();
      
   }
}