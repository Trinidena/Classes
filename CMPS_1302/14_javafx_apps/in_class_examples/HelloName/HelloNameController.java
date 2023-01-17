import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloNameController {

    @FXML
    private TextField name;

    @FXML
    private Button myButton;

    @FXML
    private TextArea myTextArea;

    @FXML
    void handleName(ActionEvent event) {
    	myTextArea.setText("Hello " + name.getText() + "!");
    }

}
