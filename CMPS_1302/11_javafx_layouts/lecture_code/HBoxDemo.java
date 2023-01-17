import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.layout.Priority;

public class HBoxDemo extends Application
{
   @Override
   public void start(Stage stage)
   {
      HBox root = new HBox();
      
      // Set spacing between nodes.
      root.setSpacing(10);
      
      // Create buttons.
      Button b0 = new Button("0");
      Button b1 = new Button("1");
      Button b2 = new Button("2");
      Button b3 = new Button("3");
      Button b4 = new Button("4");

      root.getChildren().addAll(b0, b1, b2, b3, b4);
                                                       
      Scene scene = new Scene(root, 400, 300);
      stage.setScene(scene);
      stage.setTitle("HBox Demo");
      stage.show();
   }
   
   public static void main(String[] args)
   {
      Application.launch(args);
   }
}