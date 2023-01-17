import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Main extends Application {

	public void start(Stage primaryStage) throws IOException{
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("MainScene.fxml"));
			Scene scene= new Scene(root, 400,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Multiple Scene Example");
			primaryStage.show();
		}
	}