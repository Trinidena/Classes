import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PA10 extends Application
{
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Label label = new Label("Enter Some Text:");
      Button button = new Button("Click Me");
      TextField text = new TextField();
      root.getChildren().addAll(label , button , text);
      label.relocate(250 , 110);
      button.relocate(265 , 230);
      text.relocate(220 , 170);
      Scene scene = new Scene(root , 600 , 400);
      stage.setScene(scene);
      stage.setTitle("Programming Assignment 10");
      stage.show();
   }
}