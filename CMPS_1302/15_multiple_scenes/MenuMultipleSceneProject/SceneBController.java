import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SceneBController{

    @FXML
    private Label flashThunderLabel;

    @FXML
    private Button myButton;

    @FXML
    void handleMyButton(ActionEvent event) {
    	if(flashThunderLabel.getText().equals("Flash")){
    		flashThunderLabel.setText("Thunder");
    	}
    	else {
    		flashThunderLabel.setText("Flash");
    	}   		
    }
}