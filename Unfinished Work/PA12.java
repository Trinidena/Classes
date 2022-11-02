import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Pos;

public class PA12 extends Application
{
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Label text = new Label("Text");
      Label acronym = new Label("Acronym");
      TextField field1 = new TextField();
      TextField field2 = new TextField();
      
      root.getChildren().addAll(text , acronym , field1 , field2);
      text.relocate(100 , 100);
      acronym.relocate(75 , 200);
      field1.relocate(125 , 100);
      field2.relocate(125 , 200);
      
      Scene scene = new Scene(root , 300 , 300);
      
      stage.setScene(scene);
      stage.show();
      
   }
}