import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class MoveTextController {

    @FXML
    private Button left;

    @FXML
    private Button right;

    @FXML
    private Text text;

    @FXML
    void handleLeft(ActionEvent event) {
      text.setX(text.getX() - 5);

    }

    @FXML
    void handleRight(ActionEvent event) {
      text.setX(text.getX() + 5);

    }

}
