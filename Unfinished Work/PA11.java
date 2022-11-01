import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class PA11 extends Application
{
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      HBox hBox = new HBox();
      
      
      
      Label label = new Label("JavaFX Layouts");
      Button b0 = new Button("Button 0");
      Button b1 = new Button("Button 1");
      Button b2 = new Button("Button 2");
      TextField t1 = new TextField("TextField 1");
      TextField t2 = new TextField("TextField 2");
      
      Scene scene = new Scene(root , 600 , 400);
      
      stage.setScene(scene);
      stage.setTitle("Programming Assignment 11");
      stage.show();
      
   }
}