import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class VBoxDemo extends Application
{
   @Override
   public void start(Stage stage)
   {
      VBox root = new VBox();
      root.setSpacing(30);
      
      // Create buttons.
      Button b0 = new Button("0");
      Button b1 = new Button("1");
      Button b2 = new Button("2");
      Button b3 = new Button("3");
      Button b4 = new Button("4");

      // Add buttons to BorderPane compartments.
      root.getChildren().addAll(b0, b1, b2, b3, b4);
                                                       
      Scene scene = new Scene(root, 400, 300);
      stage.setScene(scene);
      stage.setTitle("VBox Demo");
      stage.show();
   }
   
   public static void main(String[] args)
   {
      Application.launch(args);
   }
}