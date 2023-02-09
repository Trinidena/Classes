import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.collections.ObservableList;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.concurrent.Worker.State;

public class WebViewController{
        
    @FXML
    private WebView webView;
    
    @FXML
    private WebEngine webEngine;
    
    @FXML
    private WebHistory webHistory; 
    
    private String homePage; 
    
    private double webZoom;
      
    @FXML
    private Button loadButton;
    
    @FXML
    private Button refreshButton;
    
    @FXML
    private Button zoomInButton;

    @FXML
    private Button zoomOutButton;
    
    @FXML
    private Button historyButton;
    
    @FXML
    private Button backButton;

    @FXML
    private Button forwardButton;

    @FXML
    private Button jsButton;
    
    @FXML
    private TextField textField;

    @FXML
    void handleLoadButton(ActionEvent event) 
    {
      loadPage();
    }
    
    @FXML
    void handleRefreshButton(ActionEvent event) 
    {
      refreshPage();
    }
    
    @FXML
    void handleZoomInButtons(ActionEvent event) 
    {
      zoomIn();
    }

    @FXML
    void handleZoomOutButton(ActionEvent event) 
    {
      zoomOut();
    }
    
    @FXML
    void handleHistoryButton(ActionEvent event) 
    {
      displayHistory();
    }
    
    @FXML
    void handleBackButton(ActionEvent event) 
    {
      back();
    }

    @FXML
    void handleForwardButton(ActionEvent event) 
    {
      forward();
    }
    
    @FXML
    void handleJSButton(ActionEvent event) 
    {
      executeJS();
    }
    
    @FXML
    void handleTextField(ActionEvent event)
    {
      loadPage();
    }
    
    @FXML
    private void initialize()
    {  
      webEngine = webView.getEngine();
      homePage = "www.google.com";
      textField.setText(homePage);
      webZoom = 1;
      loadPage();
    }
    
    public void loadPage()
    {
      webEngine.load("https://" + textField.getText());
    }
    
    public void refreshPage()
    {
      webEngine.reload();
    }
    
    public void zoomIn()
    {
      webZoom += 0.25;
      webView.setZoom(webZoom);
    }
    
    public void zoomOut()
    {
      webZoom -= 0.25;
      webView.setZoom(webZoom);
    }
    
    public void displayHistory()
    {
      webHistory = webEngine.getHistory();
      ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
      
      for(WebHistory.Entry entry : entries)
      {
         //System.out.println(entry);
         System.out.println(entry.getUrl() + " " + entry.getLastVisitedDate());
      } 
    }
    
    public void back()
    {
      webHistory = webEngine.getHistory();
      ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
      webHistory.go(-1);
      textField.setText(entries.get(webHistory.getCurrentIndex()).getUrl());
    }
    
    public void forward()
    {
      webHistory = webEngine.getHistory();
      ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
      webHistory.go(1);
      textField.setText(entries.get(webHistory.getCurrentIndex()).getUrl());
    }
    
    public void executeJS()
    {
      webEngine.executeScript("window.location = \"https://www.youtube.com\";");
    }
}  
