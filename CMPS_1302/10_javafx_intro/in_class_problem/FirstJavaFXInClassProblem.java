import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FirstJavaFXInClassProblem extends Application
{
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Scene scene = new Scene(root, 300, 200);
      
      Label label1 = new Label("Last");
      label1.relocate(45, 45);
      Label label2 = new Label("First");
      label2.relocate(45, 85);
      TextField textField1 = new TextField();
      textField1.relocate(90, 40);
      TextField textField2 = new TextField();
      textField2.relocate(90, 80);      
      Button button = new Button("Submit");
      button.relocate(130, 130);
      
      root.getChildren().addAll(label1, textField1, label2, textField2, button);
      
      stage.setScene(scene);
      stage.setTitle("JavaFX In-Class Problem");
      stage.show();
   }
   
   public static void main(String[] args)
   {
      Application.launch(args);
   }
}
