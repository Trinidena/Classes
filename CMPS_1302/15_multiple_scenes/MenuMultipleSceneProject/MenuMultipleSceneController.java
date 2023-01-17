import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class MenuMultipleSceneController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private MenuItem menuItemA;

    @FXML
    private MenuItem menuItemB;

    @FXML
    private MenuItem menuItemC;

    @FXML
    void handleMenuItemA(ActionEvent event){
		loadPane("SceneA.fxml");    	
    }

    @FXML
    void handleMenuItemB(ActionEvent event){
    	loadPane("SceneB.fxml");		
    }

    @FXML
    void handleMenuItemC(ActionEvent event){
    	loadPane("SceneC.fxml");		
    }
    
    void loadPane(String fxmlFile){
    	try {
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(getClass().getResource(fxmlFile));
    		Parent pane = loader.load();
    		borderPane.setCenter(pane);
    	}
    	catch(IOException e){
    		e.printStackTrace();
    	}
    }
}