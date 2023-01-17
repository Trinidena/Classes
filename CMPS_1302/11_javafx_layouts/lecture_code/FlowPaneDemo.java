import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class FlowPaneDemo extends Application
{
   @Override
   public void start(Stage stage)
   {
      FlowPane root = new FlowPane();
      
      // Sets the gap between components.
      root.setHgap(10);
      root.setVgap(10);
      
      // Create buttons with different preferred sizes.
      for(int i = 0; i < 50; i++)
      {
         Button b = new Button("" + i);
         b.setPrefSize(2 * i, 3 * i + 7);
         root.getChildren().add(b);
      }   
                                                       
      Scene scene = new Scene(root, 800, 600);
      stage.setScene(scene);
      stage.setTitle("FlowPane Demo");
      stage.show();
   }
   
   public static void main(String[] args)
   {
      Application.launch(args);
   }
}