import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MicrowaveOven extends Application
{
   @Override
   public void start(Stage stage)
   {
      // A BorderPane is the root container.
      BorderPane root = new BorderPane();
      
      Label label = new Label("Door");
      TextField text = new TextField("   00:00    ");
      text.setMaxWidth(125);  // Limit the width of the TextField
      
      // A GridPane will contain the buttons.
      GridPane grid = new GridPane();
      
      /* Forcing the GridPane to have row and column contraints so 
         that it will expand to the entire right panel of the root
         BorderPane. */
      ColumnConstraints column1 = new ColumnConstraints();
      column1.setPercentWidth( 33 );
      grid.getColumnConstraints().addAll( column1, column1, column1 );
      
      RowConstraints row1 = new RowConstraints();
      row1.setPercentHeight( 25 );
      grid.getRowConstraints().addAll( row1, row1, row1, row1 );
                
      // Creating buttons in an array.
      Button[] buttons = { new Button("1"), new Button("2"),
         new Button("3"), new Button("4"), new Button("5"),  
         new Button("6"), new Button("7"), new Button("8"),     
         new Button("9"), new Button("Start"), new Button("0"),
         new Button("Stop")};      
      
      /* Nested loops to add buttons to the GridPane and adjust
         the settings on each button. */
      int button_number = 0;
      for(int row = 0; row < 4; row++)
      {
         for(int col = 0; col < 3; col++)
         {
            // Allow the button to grow in size.
            buttons[button_number].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            
            //  Add the button at index button_number to col, row of GridPane.
            grid.add(buttons[button_number], col, row);
            
            // Move on to the next button.
            button_number++;
         }
      } 
      
      /* Put the TextField in the top compartment of the root
         BorderPane and align it center right. */             
      root.setTop(text);
      BorderPane.setAlignment(text, Pos.CENTER_RIGHT);      
      
      /* Put the grid containing the buttons in the right
         compartment of the BorderPane. */
      root.setRight(grid);
      
      // Label goes in the center compartment.
      root.setCenter(label);
                                                       
      Scene scene = new Scene(root, 500, 300);
      stage.setScene(scene);
      stage.setTitle("Microwave Interface");
      stage.show();
   }
   
   public static void main(String[] args)
   {
      Application.launch(args);
   }
}