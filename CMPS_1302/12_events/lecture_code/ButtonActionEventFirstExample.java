import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ButtonActionEventFirstExample extends Application
{
   @Override
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      
      Button button = new Button("Click");
      button.setOnAction(e -> displayMessage());
      root.setCenter(button);
      
      Scene scene = new Scene(root, 400, 300);
      
      stage.setScene(scene);
      stage.setTitle("First Button Action Event Example");
      stage.show();
   }
   
   public void displayMessage()
   {
      System.out.println("The button was clicked.");
   }   
}