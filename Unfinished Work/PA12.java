import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import java.util.*;

public class PA12 extends Application
{
   TextField textField = new TextField();
   
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Label text = new Label("Text");
      Label acronym = new Label("Acronym");
      TextField textField = new TextField();
      TextField acronymField = new TextField();
      
      root.getChildren().addAll(text , acronym , textField , acronymField);
      text.relocate(90 , 100);
      acronym.relocate(65 , 200);
      textField.relocate(125 , 100);
      acronymField.relocate(125 , 200);
      
      textField.setOnAction(e -> acronymField.setText(makeAcronym(textField.getText())));
      
      Scene scene = new Scene(root , 400 , 400);
      
      stage.setScene(scene);
      stage.show();  
   }
   
   public String makeAcronym(String str)
   {
      String out = "";
      String[] words = str.split(" ");
            
      for(String word : words)
      {
         out = out + word.substring(0 , 1);
      }

      return out;
   }
}

