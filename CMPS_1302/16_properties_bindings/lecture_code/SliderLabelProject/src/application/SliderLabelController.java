package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class SliderLabelController {
	
    @FXML
    private Label label;

    @FXML
    private Slider slider;

    /* The binding can also be accomplished in code via
       the initialize method:
      
    @FXML
    public void initialize()
    {
    	label.textProperty().bind(slider.valueProperty().asString());
    } */
}