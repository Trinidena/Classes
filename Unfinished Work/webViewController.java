import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.concurrent.Worker.State;

public class WebViewController{
        
    @FXML
    public WebView webView = new WebView();
    
    public WebEngine webEngine;   
      
    @FXML
    private Button loadButton;

    @FXML
    private TextField textField;

    @FXML
    void handleLoadButton(ActionEvent event) 
    {
      webEngine.load("https://www.google.com");
    }
    
    @FXML
    void handleTextField(ActionEvent event) 
    {

    }
    
    public void initialize()
    {  
      webEngine = webView.getEngine();
      webEngine.load("youtube.com");
    }
    
    public void loadPage()
    {
      webEngine.load("google.com");
    }
}
