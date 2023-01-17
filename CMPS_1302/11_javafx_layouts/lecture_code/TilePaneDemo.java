import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.TilePane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class TilePaneDemo extends Application
{
   @Override
   public void start(Stage stage)
   {
      TilePane root = new TilePane();
      
      // Sets the gap between components.
      root.setHgap(10);
      root.setVgap(10);
      
      // Create buttons.
      for(int i = 0; i < 50; i++)
      {
         root.getChildren().add(new Button("" + i));
      }   
                                                       
      Scene scene = new Scene(root, 800, 600);
      stage.setScene(scene);
      stage.setTitle("TilePane Demo");
      stage.show();
   }
   
   public static void main(String[] args)
   {
      Application.launch(args);
   }
}