import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type High score controller.
 */
public class HighScoreController {
    /**
     * The Bounds.
     */
    Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
    private HighScoreModel model;
    @FXML
    private TextArea attemptsTextArea;
    @FXML
    private Button backButton;
    @FXML
    private Label bestScoreLabel;

    /**
     * Sets model.
     *
     * @param model the model
     */
    void setModel(HighScoreModel model) {
        this.model = model;
    }

    /**
     * Handle back button.
     *
     * @param event the event
     */
    @FXML
    void handleBackButton(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("OpenScene.fxml"));
            Parent parent = loader.load();
            ((OpenSceneController) loader.getController()).setModel(model);
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

    @FXML
    private void initialize() {
        Platform.runLater(() -> {
            attemptsTextArea.setText(model.getAttempts());
            bestScoreLabel.setText(String.valueOf(model.getBestScore()));
        });
    }
}
