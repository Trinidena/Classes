package application;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class CenterCircleExampleController {

    @FXML
    private Pane pane;

    @FXML
    private Circle circle;
    
    @FXML
    void initialize() {
    	circle.radiusProperty().bind(
    			Bindings.min(Bindings.divide(pane.widthProperty(), 4.0), 
    					Bindings.divide(pane.heightProperty(), 4.0)));
    } 
}