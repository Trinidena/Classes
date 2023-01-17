import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LoanCalculatorController {
	
	LoanTableGenerator loanTable = new LoanTableGenerator();

    @FXML
    private Button calculateButton;

    @FXML
    private TextField loanAmountBox;

    @FXML
    private TextField yearsBox;

    @FXML
    private TextArea displayArea;

    @FXML
    void handleCalculateButton(ActionEvent event) {
    	
    	double amount = 0;
    	
    	try
    	{
    		amount = Double.parseDouble(loanAmountBox.getText());
    		
    	}
    	catch(NumberFormatException e)
    	{
    		Alert a = new Alert(AlertType.WARNING);
    		a.setHeaderText("Invalid Loan Amount");
    		a.setContentText(loanAmountBox.getText() + " is not a valid loan amount. " + 
    				"Enter a numeric value.");
    		a.show();
    		return;
    	}
    	
    	int years = 0;
    	
    	try
    	{
    		years = Integer.parseInt(yearsBox.getText());   		
    	}
    	catch(NumberFormatException e)
    	{
    		Alert a = new Alert(AlertType.WARNING);
    		a.setHeaderText("Invalid Year Amount");
    		a.setContentText(yearsBox.getText() + " is not a year amount. " + 
    				"Enter an integer value.");
    		a.show();
    		return;
    	}
    	
    	loanTable.setAmount(amount);
    	loanTable.setYears(years);
    	loanTable.generateLoanTable();
    	displayArea.setText(loanTable.toString());
    }

    @FXML
    void handleLoanAmountBox(ActionEvent event) {
    	handleCalculateButton(event);
    }

    @FXML
    void handleYearsBox(ActionEvent event) {
    	handleCalculateButton(event);
    }
}
