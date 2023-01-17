import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class GridPaneDemo extends Application
{
   @Override
   public void start(Stage stage)
   {
      GridPane root = new GridPane();
      root.setAlignment(Pos.CENTER);
      
      // Sets the gap between components.
      root.setHgap(10);
      root.setVgap(10);
      
      // Uncomment to view grid lines.
      root.setGridLinesVisible(true);
      
      // Create buttons.
      Button b0 = new Button("0");
      Button b1 = new Button("1");
      Button b2 = new Button("2");
      Button b3 = new Button("3");
      Button b4 = new Button("4");
      Button b5 = new Button("5");
      Button b6 = new Button("6");
      Button b7 = new Button("7");
      Button b8 = new Button("8");
      Button b9 = new Button("9");
      Button b10 = new Button("10");
      
      /* Add buttons to BorderPane compartments.
         column index, row index */
      root.add(b0, 0, 0);
      root.add(b1, 1, 1);
      root.add(b2, 2, 2);
      root.add(b3, 3, 3);
      root.add(b4, 4, 4);
      root.add(b5, 5, 5);
      root.add(b6, 6, 6);
      root.add(b7, 7, 7);
      root.add(b8, 8, 8);                  
      root.add(b9, 9, 9);
      
      root.add(b10, 5, 1, 3, 4);
      b10.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
                                                                         
      Scene scene = new Scene(root, 500, 500);
      stage.setScene(scene);
      stage.setTitle("GridPane Demo");
      stage.show();
   }
   
   public static void main(String[] args)
   {
      Application.launch(args);
   }
}