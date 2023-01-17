import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class ConvertMilesKmController {

    @FXML
    private TextField milesBox;

    @FXML
    private TextField kmBox;

    @FXML
    void handleKmBox(ActionEvent event) {
    	try
    	{
    		double km = Double.parseDouble(kmBox.getText());
    		double miles = 0.621371 * km;
    		milesBox.setText(String.format("%.2f", miles));
    	}
    	catch(NumberFormatException e)
    	{
    		Alert a = new Alert(AlertType.WARNING);
    		a.setHeaderText("Invalid Input");
    		a.setContentText(kmBox.getText() + " is invalid input.  Enter a numeric value.");
    		a.show();
    	}
    }

    @FXML
    void handleMilesBox(ActionEvent event) {
    	try
    	{
    		double miles = Double.parseDouble(milesBox.getText());
    		double km = 1.60934 * miles;
    		kmBox.setText(String.format("%.2f", km));
    	}
    	catch(NumberFormatException e)
    	{
    		Alert a = new Alert(AlertType.WARNING);
    		a.setHeaderText("Invalid Input");
    		a.setContentText(milesBox.getText() + " is invalid input.  Enter a numeric value.");
    		a.show();
    	}
    }

}
