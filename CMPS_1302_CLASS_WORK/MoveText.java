import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.text.Text;

public class MoveText extends Application
{
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      HBox hbox = new HBox();
      
      Button left = new Button("Left");
      Button right = new Button("Right");
      right.setOnAction(e -> moveRight());
      hbox.getChildren().addAll(left , right);
      hbox.setPrefWidth(200);
      hbox.setAlignment(Pos.CENTER);
      hbox.setSpacing(10);
      Text text = new Text("Whatever");
      Pane pane = new Pane();
      pane.getChildren().add(text);
      text.relocate(160 , 100);
      root.setCenter(pane);
      root.setBottom(hbox);
      left.setOnAction(e -> text.setX(text.getX() - 5));
      right.setOnAction(e -> text.setX(text.getX() + 5));

      Scene scene = new Scene(root , 400 , 250);
      stage.setScene(scene);
      stage.setTitle("Move Text");
      stage.show();
   }
   
   public void moveRight()
   {
      System.out.println("right");
   }
}