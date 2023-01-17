import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

 
public class HelloWorldFX extends Application
{    
   @Override
   public void start(Stage stage)
   {            
      /* Create a root component for the scene.  In this case,
         a Pane object is used, but it can be any container.
         A container is any descendant of the javafx.scene.Parent class. */
      Pane root = new Pane();
      
      /* Create a Scene object with root as the root component,
         a width of 400, and a height of 250. */                
      Scene scene = new Scene(root, 400, 250);
      
      // Tells the stage object to use the scene object.
      stage.setScene(scene);
      
      // Sets the title of the stage.
      stage.setTitle("Hello World!");
      
      // Makes the stage visible.
      stage.show();
   }
    
   public static void main(String[] args)
   {
      // Launch the application.
      Application.launch(args);
   }
}