import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.animation.FillTransition;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class OpenSceneController {

    @FXML
    private Button highScoreButton;

    @FXML
    private Button playButton;

    @FXML
    private Text text;

    @FXML
    void handleHighScoreButton(ActionEvent event) {

    }

    @FXML
    void handlePlayButton(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("Pong.fxml"));
		Parent parent = loader.load();
		Scene scene = new Scene(parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
      window.setFullScreen(true);
		window.show();
    }
    
    @FXML
    void initialize()
    {
        FillTransition tr = new FillTransition(Duration.millis(3000), text, Color.RED, Color.BLUE);
        tr.setCycleCount(48);
        tr.setAutoReverse(true);
        tr.play();
    }
}
