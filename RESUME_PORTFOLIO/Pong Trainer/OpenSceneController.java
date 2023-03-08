import javafx.animation.FillTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class OpenSceneController {
    Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
    @FXML
    private Button highScoreButton;

    @FXML
    private Button playButton;

    @FXML
    private Text text;

    @FXML
    void handleHighScoreButton(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("HighScore.fxml"));
            Parent parent = loader.load();
            Scene scene = new Scene(parent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
            double x = bounds.getMinX() + (bounds.getWidth() - scene.getWidth()) * 0.5;
            double y = bounds.getMinY() + (bounds.getHeight() - scene.getHeight()) * 0.5;
            window.setX(x);
            window.setY(y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handlePlayButton(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("Pong.fxml"));
		Parent parent = loader.load();
		Scene scene = new Scene(parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene.setCursor(Cursor.NONE);
		window.setScene(scene);
        window.setX(0);
        window.setY(0);
        //window.setFullScreen(true);
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
