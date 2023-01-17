import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class TextFieldExample extends Application
{
   @Override
   public void start(Stage stage)
   {
      Pane root = new Pane();
      
      // Creating textfields.
      TextField textField1 = new TextField();
      textField1.relocate(10, 10);
      
      TextField textField2 = new TextField("Type some stuff in here.");
      textField2.setFont(new Font("Tahoma", 30)); // Changing the font.      
      textField2.relocate(200, 100);
      
      // Add the TextFields to the root container.
      root.getChildren().addAll(textField1, textField2);
      
      // Use setText() and getText() to manipulate the text in a TextField.
      textField1.setText("Add some text.");
      System.out.println(textField2.getText());
      System.out.println(textField1.getText());      
      
      Scene scene = new Scene(root, 600, 300);
      stage.setTitle("TextField Example");
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args)
   {
      Application.launch();
   }
}