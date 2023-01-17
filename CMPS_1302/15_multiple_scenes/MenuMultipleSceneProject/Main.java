import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;


public class Main extends Application {
	public void start(Stage primaryStage) throws IOException{
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("MenuMultipleScene.fxml"));
			AnchorPane sceneA = (AnchorPane)FXMLLoader.load(getClass().getResource("SceneA.fxml"));
			root.setCenter(sceneA);
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Multi Scene Menu Bar Example");
			primaryStage.show();
	}
}
