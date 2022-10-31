import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Pos;

public class SixLabels extends Application
{
   private int labelNumber;
   
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      Label[] labels = {new Label("Label 1") , new Label("Label 2") , new Label("Label 3") , 
                         new Label("Label 4") , new Label("Label 5") , new Label("Label 6")};
      for(int i = 1; i < labels.length; i++)
      {
         labels[i].setVisible(false);
      }
      Scene scene = new Scene(root , 400 , 400);
      VBox vbox = new VBox();
      vbox.getChildren().addAll(labels);
      Button button = new Button("Click Me");
      button.setOnAction(e -> cycleLabels(labels));
      root.setBottom(button);
      BorderPane.setAlignment(button , Pos.CENTER);
      vbox.setAlignment(Pos.CENTER);
      root.setCenter(vbox);
      stage.setScene(scene);
      stage.setTitle("Six Labels");
      stage.show();
   }
   
   public void cycleLabels(Label[] labels)
   {
      labels[labelNumber].setVisible(false);
      labelNumber = (labelNumber + 1) % 6;
      labels[labelNumber].setVisible(true);
   }
}