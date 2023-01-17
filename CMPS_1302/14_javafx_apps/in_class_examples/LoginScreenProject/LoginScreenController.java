import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginScreenController {

    @FXML
    private TextField userIdTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Label warningLabel;

    @FXML
    void handleLogin(ActionEvent event) {
    	warningLabel.setText("");
    	String userId = userIdTextField.getText();
    	String password = passwordTextField.getText();
    	if(userId.equals("blumbergh") && password.equals("12345")) {
    		warningLabel.setText("Login successful!");
    	}
    	else {
    		warningLabel.setText("Invalid user name or password.");
    	}	
    }
}
