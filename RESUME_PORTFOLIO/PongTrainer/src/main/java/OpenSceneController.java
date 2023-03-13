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

/**
 * The type Open scene controller.
 */
public class OpenSceneController {
    /**
     * The Bounds.
     */
    Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
    /**
     * The Tr.
     */
    FillTransition tr;
    /**
     * The Tr 2.
     */
    FillTransition tr2;
    /**
     * The Tr 3.
     */
    FillTransition tr3;
    /**
     * The Tr 4.
     */
    FillTransition tr4;
    /**
     * The Tr 5.
     */
    FillTransition tr5;
    /**
     * The Tr 6.
     */
    FillTransition tr6;
    private HighScoreModel model;
    @FXML
    private Button highScoreButton;
    @FXML
    private Button playButton;
    @FXML
    private Text text;

    /**
     * Sets model.
     *
     * @param model the model
     */
    public void setModel(HighScoreModel model) {
        this.model = model;
    }

    /**
     * Handle high score button.
     *
     * @param event the event
     */
    @FXML
    void handleHighScoreButton(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HighScore.fxml"));
            Parent parent = loader.load();
            ((HighScoreController) loader.getController()).setModel(model);
            //loader.<HighScoreController>getController().setModel(model);
            Scene scene = new Scene(parent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
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

    /**
     * Handle play button.
     *
     * @param event the event
     * @throws IOException the io exception
     */
    @FXML
    void handlePlayButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Pong.fxml"));
        Parent parent = loader.load();
        ((PongController) loader.getController()).setModel(model);
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene.setCursor(Cursor.NONE);
        window.setScene(scene);
        window.setX(0);
        window.setY(0);
        //window.setFullScreen(true);
        window.show();
    }

    @FXML
    private void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Pong.fxml"));
        Parent parent = loader.load();
        loader.<PongController>getController().setModel(model);

        tr = new FillTransition(Duration.millis(1000), text, Color.RED, Color.ORANGE);
        tr2 = new FillTransition(Duration.millis(1000), text, Color.ORANGE, Color.YELLOW);
        tr3 = new FillTransition(Duration.millis(1000), text, Color.YELLOW, Color.SPRINGGREEN);
        tr4 = new FillTransition(Duration.millis(1000), text, Color.SPRINGGREEN, Color.BLUE);
        tr5 = new FillTransition(Duration.millis(1000), text, Color.BLUE, Color.MEDIUMPURPLE);
        tr6 = new FillTransition(Duration.millis(1000), text, Color.MEDIUMPURPLE, Color.RED);

        tr.setCycleCount(1);
        tr2.setCycleCount(1);
        tr3.setCycleCount(1);
        tr4.setCycleCount(1);
        tr5.setCycleCount(1);

        tr.setAutoReverse(true);
        tr2.setAutoReverse(true);
        tr3.setAutoReverse(true);
        tr4.setAutoReverse(true);
        tr5.setAutoReverse(true);

        tr.play();

        tr.setOnFinished((e) -> tr2.play());
        tr2.setOnFinished((e) -> tr3.play());
        tr3.setOnFinished((e) -> tr4.play());
        tr4.setOnFinished((e) -> tr5.play());
        tr5.setOnFinished((e) -> tr6.play());
        tr6.setOnFinished((e) -> playTransition());
    }

    /**
     * Play transition.
     */
    public void playTransition() {
        tr.play();

        tr.setOnFinished((e) -> tr2.play());
        tr2.setOnFinished((e) -> tr3.play());
        tr3.setOnFinished((e) -> tr4.play());
        tr4.setOnFinished((e) -> tr5.play());
        tr5.setOnFinished((e) -> tr6.play());
        tr6.setOnFinished((e) -> playTransition());
    }
}