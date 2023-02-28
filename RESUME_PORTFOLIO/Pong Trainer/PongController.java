import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.animation.Animation;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Robot;

public class PongController {

    private Timeline timeline;
    private Timeline increaseSpeed;

    private double dx = 1;
    private double dy = 1;

    @FXML
    private Pane pane;
    
    @FXML
    private Circle circle;
    
    @FXML
    private Rectangle rectangle;
    
    @FXML
    public void handleMouseMoved(MouseEvent event)
    {
        rectangle.setX(event.getX() - (pane.getWidth() / 2.35));  
    }
    
    @FXML
    public void handleBall(ActionEvent event) //throws IOException
    {
               circle.setLayoutX(circle.getLayoutX() + dx);
               circle.setLayoutY(circle.getLayoutY() + dy);
               
               if(circle.getLayoutY() < circle.getRadius())
               {
                  dy = Math.abs(dy);
               }

               if(circle.getLayoutX() < circle.getRadius())
               {
                  dx = Math.abs(dx);
               }

               if(circle.getLayoutX() > pane.getWidth() - circle.getRadius())
               {
                  dx = -Math.abs(dx);
               }
                              
               if(circle.getBoundsInParent().intersects(rectangle.getBoundsInParent()))
               {
                  System.out.println("in here " + dy);
                  dy = -Math.abs(dy);
               }
               
               if(circle.getLayoutY() > pane.getHeight() + circle.getRadius())
               {
                  System.out.println("ball is below the screen");
                  timeline.stop();
                  increaseSpeed.stop();
                  try{
		               FXMLLoader loader = new FXMLLoader();
		               loader.setLocation(getClass().getResource("OpenSceneFXML.fxml"));
		               Parent parent = loader.load();
		               Scene scene = new Scene(parent);
                     System.out.println(event.getSource());
		               //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                     Stage window = (Stage)(circle.getParent()).getScene().getWindow();
		               window.setScene(scene);
		               window.show();
                   }
                   catch(IOException e)
                   {
                     return;
                   }                     
               }
    
    }
    
    public void speedUp()
    {
        if(dx > 0)
        {
            dx++;
        }
        else
        {
            dx--;
        }
        if(dy > 0)
        {
            dy++;
        }
        else
        {
            dy--;
        }    
    }
    @FXML
    public void initialize() throws IOException
    {      
      //moveCursor((int)(pane.getWidth() / 2) , (int)(pane.getHeight() / 2));
       
       timeline = new Timeline(new KeyFrame(Duration.millis(20),
           e -> handleBall(e)));   
       timeline.setCycleCount(Timeline.INDEFINITE);
       timeline.play();
       
       increaseSpeed = new Timeline(new KeyFrame(Duration.millis(10000),
           e -> speedUp()));
       increaseSpeed.setCycleCount(Timeline.INDEFINITE);
       increaseSpeed.play();    
    }
    
    public void moveCursor(int screenX, int screenY) 
    {
       Platform.runLater(() -> {
           try 
           {
               Robot robot = new Robot();
               robot.mouseMove(screenX, screenY);
           } 
           catch (AWTException e) 
           {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
    });
    }
}
