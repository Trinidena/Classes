import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Converter extends Application
{
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Label milesLabel = new Label("Miles: ");
      Label kmLabel = new Label("Kms: ");
      TextField milesField = new TextField();
      TextField kmField = new TextField();
      root.getChildren().addAll(milesLabel , kmLabel , milesField , kmField);
      milesLabel.relocate(100 , 100);
      kmLabel.relocate(100 , 200);
      milesField.relocate(200 , 100);
      kmField.relocate(200 , 200);
      milesField.setOnAction(e -> kmField.setText(convertMilesToKm(milesField.getText())));
      Scene scene = new Scene(root , 400 , 300);
      stage.setScene(scene);
      stage.setTitle("Converter");
      stage.show();
   }
   
   public String convertMilesToKm(String milesString)
   {
      double miles = Double.parseDouble(milesString);
      double km = 1.6 * miles;
      return "" + km;
   }
}