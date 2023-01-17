import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;

public class SceneCController {

    @FXML
    private Text sceneCText;

    @FXML
    private ToggleButton myToggleButton;

    @FXML
    void handleToggleButton(ActionEvent event) {
    	sceneCText.setRotate(sceneCText.getRotate() + 5);
    }
}