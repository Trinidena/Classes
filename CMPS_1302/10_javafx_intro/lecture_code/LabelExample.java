import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
 
public class LabelExample extends Application
{    
   @Override
   public void start(Stage stage)
   {            
      Pane root = new Pane();
      
      // Creating some labels.
      Label label1 = new Label("Label 1");
      label1.setFont(new Font("Arial", 30)); // Changing the font.
      label1.relocate(10, 10); // Set the position of the labe in the Pane.
      
      Label label2 = new Label("Label 2");
      label2.setTextFill(Color.web("#0076a3")); // Changing the text color.
      label2.relocate(500, 500);
          
      Label label3 = new Label("Label 3");
      // Change border color and background color      
      label3.setStyle("-fx-border-color:red; -fx-background-color: blue;");
      label3.setPadding(new Insets(20, 40, 80, 160));  // Change label padding.
      label1.relocate(200, 200);
                  
      Label label4 = new Label("Label 4");
      label4.setStyle("-fx-border-color:black; -fx-background-color: yellow;");
      label4.setFont(new Font("Times New Roman", 30));      
      label4.setRotate(60); // Rotate label
      label4.relocate(300, 300);    
      
      // Labels can contain images.
      Image image = new Image(getClass().getResourceAsStream("star.png"));   
      Label label5 = new Label("Label 5", new ImageView(image)); 
      label5.setStyle("-fx-border-color:black;");              
      label5.relocate(400, 50);
            
      Label label6 = new Label(); // Creating a blank label
      label6.setText("Label 6");  // Changing the text of label6.
      label6.relocate(100, 500);      
      System.out.println(label6.getText()); // Print the text of label6.
      
      // Adding label3 to the root component.
      root.getChildren().add(label3);
      
      // Adding some of the other labels to the root component.
      root.getChildren().addAll(label2, label1, label5, label6);
      
      // Add label4 at index 1.
      root.getChildren().add(1, label4);
                     
      Scene scene = new Scene(root, 800, 600);
      stage.setScene(scene);
      stage.setTitle("Label Example");
      stage.show();
   }
    
   public static void main(String[] args)
   {
      // Launch the application.
      Application.launch(args);
   }
}