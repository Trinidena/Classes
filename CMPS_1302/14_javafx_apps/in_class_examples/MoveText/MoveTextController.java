import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class MoveTextController {

    @FXML
    private Button leftButton;

    @FXML
    private Button rightButton;

    @FXML
    private Text someText;

    @FXML
    void handleLeftButton(ActionEvent event) {
    	someText.setX(someText.getX() - 1);
    }

    @FXML
    void handleRightButton(ActionEvent event) {
    	someText.setX(someText.getX() + 1);
    }
}