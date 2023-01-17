import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application
{
   @Override
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      
      // Create buttons.
      Button b0 = new Button("0");
      Button b1 = new Button("1");
      Button b2 = new Button("2");
      Button b3 = new Button("3");
      Button b4 = new Button("4");

      // Add buttons to BorderPane compartments.
      root.setTop(b0);
      root.setBottom(b1);
      root.setLeft(b2);
      root.setRight(b3);
      root.setCenter(b4);


      // Set positioning for buttons within comparments.
      BorderPane.setAlignment(b0, Pos.CENTER);           // default for Top is TOP_LEFT
      BorderPane.setAlignment(b1, Pos.BOTTOM_CENTER);    // default for Bottom is BOTTOM_LEFT  
      BorderPane.setAlignment(b2, Pos.BOTTOM_RIGHT);     // default for left is TOP_LEFT
      BorderPane.setAlignment(b3, Pos.CENTER_RIGHT);     // default for right is TOP_RIGHT
      BorderPane.setAlignment(b4, Pos.TOP_LEFT);         // default for center is CENTER
                                                       
      Scene scene = new Scene(root, 400, 300);
      stage.setScene(scene);
      stage.setTitle("BorderPane Demo");
      stage.show();
   }
   
   public static void main(String[] args)
   {
      Application.launch(args);
   }
}