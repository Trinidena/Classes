import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SceneAController {

    @FXML
    private Label myLabel;

    @FXML
    private TextField textField;

    @FXML
    void handleTextField(ActionEvent event) {
    	myLabel.setText(textField.getText());
    	textField.setText("");
    }
}