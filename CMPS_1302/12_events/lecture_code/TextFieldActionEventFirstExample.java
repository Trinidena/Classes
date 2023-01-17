import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextFieldActionEventFirstExample extends Application
{  
   @Override
   public void start(Stage stage)
   {
      FlowPane root = new FlowPane();
      root.setAlignment(Pos.CENTER);
      
      TextField textField = new TextField();
      textField.setOnAction(e -> displayContents(textField.getText()));
      root.getChildren().add(textField);
      
      Scene scene = new Scene(root, 400, 300);
      
      stage.setScene(scene);
      stage.setTitle("TextField Action Event Example");
      stage.show();
   }
   
   public void displayContents(String in)
   {
      System.out.println(in);
   }
   
   public static void main(String[] args)
   {
      Application.launch(args);
   }   
}