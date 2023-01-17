import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class ButtonExample extends Application
{
   @Override
   public void start(Stage stage)
   {  
      Pane root = new Pane();
      
      // Creating some buttons.
      Button button1 = new Button("Button 1");
      button1.setFont(new Font("Tahoma", 30)); // Changing the font.
      button1.relocate(10, 10);
            
      Button button2 = new Button("Button 2");
      button2.setTextFill(Color.web("#0076a3")); // Changing the text color.
      button2.relocate(100, 200);
        
      // Change border color and background color 
      Button button3 = new Button("Button 3");           
      button3.setStyle("-fx-border-color:red; -fx-background-color: blue;");
      button3.setPadding(new Insets(20, 40, 80, 160));  // Change label padding.
      button3.relocate(200, 10);
                  
      Button button4 = new Button("Button 4");
      button4.setStyle("-fx-border-color:black; -fx-background-color: yellow;");
      button4.setFont(new Font("Times New Roman", 30));      
      button4.setRotate(60); // Rotate label
      button4.relocate(300, 200);
      
      // Buttons can contain images.
      Image image = new Image(getClass().getResourceAsStream("star.png"));   
      Button button5 = new Button("Button 5", new ImageView(image)); 
      button5.setStyle("-fx-border-color:black;");
      button5.relocate(500, 10);
                   
      // Adding the buttons to root.
      root.getChildren().add(button4);
      root.getChildren().addAll(button2, button3);
      root.getChildren().add(2, button1);
      root.getChildren().add(button5);
      
      Scene scene = new Scene(root, 900, 400);
      stage.setTitle("Button Example");
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args)
   {
      Application.launch(args);
   }
}