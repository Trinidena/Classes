
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import java.util.ResourceBundle;
import java.net.URL;

public class webViewController {

    @FXML
    private WebView webView;
    
    private WebEngine webEngine;   
      
    @FXML
    private Button loadButton;

    @FXML
    private TextField textField;

    @FXML
    void handleLoadButton(ActionEvent event) 
    {
      
    }
    
    @FXML
    void handleLoadButton() 
    {
      webEngine.load("https://www.google.com");
    }

    @FXML
    void handleTextField(ActionEvent event) 
    {

    }
    
    public void initialize()
    {
      handleLoadButton();
    }
}
