import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MoveText extends Application
{
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      HBox buttonBox = new HBox();
      buttonBox.setAlignment(Pos.CENTER);
      Pane textPane = new Pane();
      Text text = new Text(200, 200, "Move Text");
      Button left = new Button("Left");
      left.setOnAction(e -> text.setX(text.getX() - 1));
           
      Button right = new Button("Right");
      right.setOnAction(e -> text.setX(text.getX() + 1));       
      root.setBottom(buttonBox);
      buttonBox.getChildren().addAll(left, right);
      BorderPane.setAlignment(buttonBox, Pos.CENTER);
      
      root.setCenter(textPane);
      textPane.getChildren().add(text);
      
      Scene scene = new Scene(root, 400, 300);
      stage.setScene(scene);
      stage.setTitle("Move Text");
      stage.show();
   }
}