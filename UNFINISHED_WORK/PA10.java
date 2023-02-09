import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class InClassExample extends Application {
   public void start(Stage stage) {
      Pane root = new Pane();

      Label label1 = new Label("In");
      Label label2 = new Label("Out");
      TextField inText = new TextField();
      TextField outText = new TextField();
      Button button = new Button("Click Me");

      root.getChildren().addAll(label1, label2, inText, outText, button);
      inText.relocate(100, 75);
      outText.relocate(100, 125);
      button.relocate(120, 175);
      label1.relocate(70, 75);
      label2.relocate(70, 125);

      Scene scene = new Scene(root, 400, 250);
      stage.setScene(scene);
      stage.show();
   }
}