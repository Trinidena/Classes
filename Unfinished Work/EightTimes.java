import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Pos;

public class EightTimes extends Application
{
   private int count;
   
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      Button button = new Button("Click Me 8 Times!");
      Label label = new Label("That's enough!");
      button.setOnAction(e -> clickEight(button));
      Scene scene = new Scene(root , 200 , 200); 
      root.setCenter(button);
      root.setCenter(label);
      label.relocate(150 , 150);
      stage.setScene(scene);
      stage.setTitle("Disable the button by clicking eight times!");
      stage.show();
   }
   
   public void clickEight(Button button)
   {
      count++;
      if(count % 8 ==0)
      {
         button.setVisible(false);
         
      } 
   }
}
