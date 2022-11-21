import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class TriangleController {

   private TriangleModel model;
   
   @FXML
   private TextField aTextField;

   @FXML
   private TextField bTextField;

   @FXML
   private Button button;

   @FXML
   private TextArea textArea;

   @FXML
   void handleButton(ActionEvent event) {
      String aString = aTextField.getText();
      String bString = bTextField.getText();
      double a;
      double b;
      try
      {
         a = Double.parseDouble(aString);
         b = Double.parseDouble(bString);
      }
      catch(NumberFormatException e)
      {  
         Alert alert = new Alert(AlertType.WARNING , "No!");
         alert.showAndWait();
         return;
      }
      model.addResult(a , b);
      //double c = Math.sqrt(a * a + b * b);
      textArea.setText(model.toString());
   }
   
   @FXML
   public void initialize()
   {
      model = new TriangleModel();
   }

}
