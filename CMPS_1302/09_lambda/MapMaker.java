import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.HashMap;
import javafx.scene.control.Alert.AlertType;

public class MapMaker extends Application
{
   private HashMap<String, Double> map = new HashMap<String, Double>();
   
   @FXML private TextField keyBox;
   @FXML private TextField valueBox;
   @FXML private TextArea textArea;
   @FXML private Button displayButton;
   
   @FXML protected void handleKeyValueBoxes(ActionEvent e)
   {
      String key = keyBox.getText().trim();
      String doubleString = valueBox.getText().trim();
      
      if(key.length() == 0)
      {
         Alert alert = new Alert(AlertType.ERROR);
         alert.setTitle("Invalid Input");
         alert.setHeaderText("Invalid Input");
         alert.setContentText("Key must contain non-whitespace characters.");
         alert.showAndWait();
         return;      
      }
      
      try
      {
         double number = Double.parseDouble(doubleString);
         map.put(key, number);
      }
      catch(NumberFormatException ex)
      {
         Alert alert = new Alert(AlertType.ERROR);
         alert.setTitle("Invalid Input");
         alert.setHeaderText("Invalid Input");
         alert.setContentText("Value must be numeric.");
         alert.showAndWait();         
      }   
   }
   
   @FXML protected void handleDisplayButton(ActionEvent e)
   {
      StringBuilder out = new StringBuilder();
      map.entrySet().forEach(entry -> out.append(String.format("Key: %-10s Value: %f%n",
         entry.getKey(), entry.getValue())));
      textArea.setText(out.toString());      
   }
                     
   @Override
   public void start(Stage stage) throws IOException
   {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("map_maker.fxml"));
         loader.setController(this);
         Parent root = loader.load();
         
         Scene scene = new Scene(root);
         stage.setTitle("Map Maker");
         stage.setScene(scene);
         stage.show();              
   } 
}