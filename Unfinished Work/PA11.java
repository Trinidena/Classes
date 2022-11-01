import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;

public class PA11 extends Application
{
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      VBox vbox = new VBox();
      HBox hbox = new HBox();
      HBox title = new HBox();
       
      Label label = new Label("JavaFX Layouts");
      Button b0 = new Button("Button 0");
      Button b1 = new Button("Button 1");
      b1.setMinWidth(64); // Commenting out will make this button uneven for some reason.
      Button b2 = new Button("Button 2");
      TextField t1 = new TextField("TextField 1");
      TextField t2 = new TextField("TextField 2");
      
      vbox.getChildren().addAll(b0 , b1 , b2);
      hbox.getChildren().addAll(t1 , t2);
      title.getChildren().addAll(label);
      title.setAlignment(Pos.CENTER);
      
      root.setTop(title);
      root.setCenter(hbox);
      root.setLeft(vbox);
      root.setMargin(hbox, new Insets(0, 0, 0, 50));
      
      
      Scene scene = new Scene(root , 650 , 400); 
      
      stage.setScene(scene);
      stage.setTitle("Programming Assignment 11");
      stage.show();
      
   }
}