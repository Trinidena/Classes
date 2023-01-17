import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class SceneGraphImplementation extends Application
{
   @Override
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();

      Label message = new Label("This is a message.");

      HBox buttonBar = new HBox();      
      Button helloButton = new Button("Hello");
      Button goodByeButton = new Button("Goodbye");
      Button quitButton = new Button("Quit");
      buttonBar.getChildren().addAll(helloButton, goodByeButton, quitButton);
      buttonBar.setAlignment(Pos.CENTER);
            
      root.setCenter(message);
      root.setBottom(buttonBar);
    
      Scene scene = new Scene(root, 400, 300);
      stage.setScene(scene);
      stage.setTitle("Scene Graph Implementation");
      stage.show();
   }
   public static void main(String[] args)
   {
      Application.launch(args);
   }
}