import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.io.IOException;

/**
 * The type Pong controller.
 */
public class PongController {

    /**
     * The Bounds.
     */
    Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
    private Timeline timeline;
    private HighScoreModel model;
    private final int count = 0;
    private double dx = 2;
    private double dy = 2;

    @FXML
    private Pane pane;

    @FXML
    private Circle circle;

    @FXML
    private Rectangle rectangle;

    /**
     * Sets model.
     *
     * @param model the model
     */
    public void setModel(HighScoreModel model) {
        this.model = model;
    }

    /**
     * Handle mouse moved.
     *
     * @param event the event
     */
    @FXML
    public void handleMouseMoved(MouseEvent event) {
        rectangle.setX(event.getX() - (pane.getWidth() / 2));
    }

    /**
     * Handle ball.
     *
     * @param event the event
     */
    @FXML
    public void handleBall(ActionEvent event) //throws IOException
    {
        circle.setLayoutX(circle.getLayoutX() + dx);
        circle.setLayoutY(circle.getLayoutY() + dy);

        if (circle.getLayoutY() < circle.getRadius()) {
            dy = Math.abs(dy);
        }

        if (circle.getLayoutX() < circle.getRadius()) {
            dx = Math.abs(dx);
        }

        if (circle.getLayoutX() > pane.getWidth() - circle.getRadius()) {
            dx = -Math.abs(dx);
        }

        if (circle.getBoundsInParent().intersects(rectangle.getBoundsInParent())) {
            System.out.println("in here " + dy);
            dy = -Math.abs(dy);
            speedUp(1.5);
            model.setScore(model.getScore() + 1);
        }

        if (circle.getLayoutY() > pane.getHeight() + circle.getRadius()) {
            System.out.println("ball is below the screen");
            timeline.stop();
            model.setAttemptCount(1);
            model.setAttempts(model.getAttemptCount(), model.getScore());
            //increaseSpeed.stop();
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("OpenScene.fxml"));
                Parent parent = loader.load();
                ((OpenSceneController) loader.getController()).setModel(model);
                //loader.<OpenSceneController>getController().setModel(model);
                Scene scene = new Scene(parent);
                System.out.println(event.getSource());
                //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                Stage window = (Stage) (circle.getParent()).getScene().getWindow();
                window.setScene(scene);
                window.show();
                double x = bounds.getMinX() + (bounds.getWidth() - scene.getWidth()) * 0.5;
                double y = bounds.getMinY() + (bounds.getHeight() - scene.getHeight()) * 0.5;
                window.setX(x);
                window.setY(y);

            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Loading New Scene");
                alert.setHeaderText("SOMETHING WENT WRONG!!!!");
                alert.showAndWait();

            }
        }

    }

    /**
     * Speed up.
     *
     * @param x the x
     */
    public void speedUp(double x) {
        if (dx > 0) {
            dx += x;
        } else {
            dx -= x;
        }
        if (dy > 0) {
            dy += x;
        } else {
            dy -= x;
        }
    }

    @FXML
    private void initialize() {
        Platform.runLater(() -> model.setScore(0));
        timeline = new Timeline(new KeyFrame(Duration.millis(20),
                this::handleBall));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        // increaseSpeed = new Timeline(new KeyFrame(Duration.millis(10000),
        //     e -> speedUp(1)));
        // increaseSpeed.setCycleCount(Timeline.INDEFINITE);
        // increaseSpeed.play();
    }

    /**
     * Move cursor.
     *
     * @param screenX the screen x
     * @param screenY the screen y
     */
    public void moveCursor(int screenX, int screenY) {
        Platform.runLater(() -> {
            try {
                Robot robot = new Robot();
                robot.mouseMove(screenX, screenY);
            } catch (AWTException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }
}
