import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class Converter extends Application
{
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Label milesLabel = new Label("Miles: ");
      milesLabel.relocate(100, 100);
      Label kmLabel = new Label("Kms:    ");
      kmLabel.relocate(100, 200);
      TextField milesField = new TextField();
      milesField.relocate(200, 100);
      TextField kmField = new TextField();
      kmField.relocate(200, 200);
      milesField.setOnAction(e -> kmField.setText(convertMilesToKm(milesField.getText() , e , milesField)));
      kmField.setOnAction(e -> milesField.setText(convertKmToMiles(kmField.getText())));
      root.getChildren().addAll(milesLabel, kmLabel, milesField, kmField);
      Scene scene = new Scene(root, 400, 300);
      stage.setScene(scene);
      stage.setTitle("Converter");
      stage.show();
   }
   
   public String convertMilesToKm(String milesString , ActionEvent event, TextField textfield)
   {
      Object source = event.getSource();
      System.out.println(textField);
      System.out.println(source);
      System.out.println(source.equals(textField));
      double miles = 0;
      try
      {
         miles = Double.parseDouble(milesString);
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.WARNING);
         alert.setTitle("Invalid Input");
         alert.setHeaderText("Invalid Input: " + milesString);
         alert.setContentText("You entered something that didnt make sense.");
         alert.showAndWait();
         return "";
      }
      double km = 1.6 * miles;
      return "" + km;
   }
   public String convertKmToMiles(String kmString)
   {
      double kms = 0;
      try
      {
         kms = Double.parseDouble(kmString);
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.WARNING);
         alert.setTitle("Invalid Input");
         alert.setHeaderText("Invalid Input: " + kmString);
         alert.setContentText("You entered something that didnt make sense.");
         alert.showAndWait();
         return "";
      }
      double miles = 0.6 * kms;
      return "" + miles;
   }
} 
