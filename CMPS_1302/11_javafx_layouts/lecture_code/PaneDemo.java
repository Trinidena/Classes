import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PaneDemo extends Application
{
   @Override
   public void start(Stage stage)
   {
      // Create Pane to be the root component.
      Pane root = new Pane();
      
      // Create buttons.
      Button b0 = new Button("0");
      Button b1 = new Button("1");
      Button b2 = new Button("2");
      Button b3 = new Button("3");
      Button b4 = new Button("4");
      
      // Move buttons to location.
      b0.relocate(10, 10);                           
      b1.relocate(10, 250);
      b2.relocate(100, 10);                           
      b3.relocate(300, 200);
      b3.resize(150,75);  // no effect because b3 is managed.
      b4.relocate(350, 250);
      b4.setManaged(false); // setting b4 to unmanaged
      b4.resize(150, 75);
      
      // Add buttons to root component.                                       
      root.getChildren().addAll(b0, b1, b2, b3, b4);
           
      Scene scene = new Scene(root, 600, 450);
      stage.setScene(scene);
      stage.setTitle("Pane Demo");
      stage.show();
   }
   
   public static void main(String[] args)
   {
      Application.launch(args);
   }
}