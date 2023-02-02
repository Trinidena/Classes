import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;

public class WebViewController {

    @FXML
    private Button loadButton;

    @FXML
    private TextField textField;

    @FXML
    private WebView webView;

    @FXML
    void handleLoadButton(ActionEvent event) {

    }

    @FXML
    void handleTextField(ActionEvent event) {

    }
    
    public void initialize()
    {
      WebEngine webEngine = webView.getEngine();
      webEngine.load("https://www.google.com");
    }
   
}
