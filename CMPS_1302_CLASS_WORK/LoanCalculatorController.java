import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoanCalculatorController {

   @FXML
    private TextField amountField;

   @FXML
    private Button button;

   @FXML
    private TextArea textArea;

   @FXML
    private TextField yearsField;

   @FXML
    void handleButton(ActionEvent event) {
      String yearsString = yearsField.getText();
      String amountString = amountField.getText();
      int years = 0;
      double loanAmount = 0.0;
      boolean isYearsGood = false;
      try
      {
         years = Integer.parseInt(yearsString);
         isYearsGood = true;
         loanAmount = Double.parseDouble(amountString);
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.WARNING);
         //alert.showAndWait();
         alert.setTitle("FATAL ERROR!");
         alert.setHeaderText("Invalid Input");
         if(isYearsGood)
         {
         alert.setContentText("You entered \"" + amountString + "\" for the amount, which is not a number." );
         }
         else
         {
            alert.setContentText("You entered \"" + yearsString + "\" for the years, which is not a number." );
         }
         alert.showAndWait();
         return;
      }
      
      String outString = "\nInterest Rate\t\tMonthly Payment\t\tTotal Payment\n";
   
      for(int i = 0; i < 25; i++)
      {
         double yearlyRate = 0.05 + 0.00125 * i;
         double monthlyRate = yearlyRate / 12.0;
         double payment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12.0));
         double totalPayment = payment * years * 12.0; 
         outString += String.format("%.3f%%\t\t\t\t$%.2f\t\t\t\t$%,.2f%n", 100 * yearlyRate, payment, totalPayment);
      }
      
      textArea.setText(outString);
   }

}
