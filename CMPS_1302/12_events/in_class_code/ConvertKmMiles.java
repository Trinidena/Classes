import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;

public class ConvertKmMiles extends Application
{
   TextField kmTextField;
   TextField milesTextField;
   
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Label kmLabel = new Label("Kilometers");
      kmLabel.relocate(100, 100);
      Label milesLabel = new Label("Miles");
      milesLabel.relocate(100, 200);
      kmTextField = new TextField();
      kmTextField.relocate(200, 95);
      kmTextField.setOnAction(e -> calculateMiles());
      milesTextField = new TextField();
      milesTextField.relocate(200, 195);
      milesTextField.setOnAction(e -> calculateKms());
      
      root.getChildren().addAll(kmLabel, milesLabel, kmTextField, milesTextField);
      
      Scene scene = new Scene(root, 400, 300);
      stage.setScene(scene);
      stage.setTitle("Kilometers Miles Converter");
      stage.show();
   }
   
   public void calculateMiles()
   {
      String kmString = kmTextField.getText();
      try
      {
         double kmval = Double.parseDouble(kmString);
         double milesval = kmval * 0.63;
         milesTextField.setText(String.format("%.2f", milesval));
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.ERROR);
         alert.setTitle("Invalid Value");
         alert.setHeaderText("CRITICAL ERROR!!!!!");
         alert.setContentText(String.format("You entered %s which is invalid.", kmString));
         alert.showAndWait();
      }   
   }
   
   public void calculateKms()
   {
      String milesString = milesTextField.getText();
      try
      {
         double milesval = Double.parseDouble(milesString);
         double kmval = milesval * 1.6;
         kmTextField.setText(String.format("%.2f", kmval));
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.ERROR);
         alert.setTitle("Invalid Value");
         alert.setHeaderText("CRITICAL ERROR!!!!!");
         alert.setContentText(String.format("You entered %s which is invalid.", milesString));
         alert.showAndWait();
      }          
   }
}