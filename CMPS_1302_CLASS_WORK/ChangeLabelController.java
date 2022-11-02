import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ChangeLabelController {

    @FXML
    private Label label;

    @FXML
    private TextField textfield;

    @FXML
    void handleTextField(ActionEvent event) {
         label.setText(textfield.getText());
    }

}
