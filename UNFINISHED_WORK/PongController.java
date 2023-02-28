import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.event.EventHandler;

public class PongController {

   @FXML
   private Circle circle;

   @FXML
   private Pane pane;

   @FXML
   private Rectangle rectangle;

   double dx = 1.5;
   double dy = 1.5;
   
   @FXML
   void handleMouseMoved(MouseEvent event) {
      rectangle.setX(event.getX() - (pane.getWidth() / 2));
   }
   
   private void handleAnimation(ActionEvent e)
   {
      circle.setLayoutX(circle.getLayoutX() + dx);
      circle.setLayoutY(circle.getLayoutY() + dy);
      
      if(circle.getBoundsInParent().intersects(rectangle.getBoundsInParent()))
      {
         dy = -dy;
         System.out.println("Collision");
      }
      
      if(circle.getLayoutX() > pane.getWidth() - circle.getRadius() || circle.getLayoutX() < circle.getRadius())
      {
         dx = -dx;
      }
      
      if(circle.getLayoutY() < circle.getRadius())
      {
         dy = -dy;
      }
      
   }
   
   public void increaseSpeed()
   {
      if(dx > 0)
      {
         dx += 5;
      }
      else
      {
         dx -= 5;
      }
      if(dy > 0)
      {
         dy += 5;
      }
      else
      {
         dy -= 5;
      }

   }
   
   @FXML
   public void initialize()
   {
      Timeline tl = new Timeline(new KeyFrame(Duration.millis(20) , e -> handleAnimation(e)));
      tl.setCycleCount(Timeline.INDEFINITE);
      tl.play();
      Timeline t2 = new Timeline(new KeyFrame(Duration.millis(10000) , e -> increaseSpeed()));
      t2.setCycleCount(Timeline.INDEFINITE);
      t2.play();
   }
}
