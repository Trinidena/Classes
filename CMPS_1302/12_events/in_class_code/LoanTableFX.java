import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;

public class LoanTableFX extends Application
{
   TextField amountTextField;
   TextField yearsTextField;
   TextArea textArea;
   
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Button button = new Button("Calculate");
      button.relocate(650, 50);
      button.setOnAction(e -> calculateLoanTable());
      Label amountLabel = new Label("Amount");
      amountLabel.relocate(50, 50);
      Label yearsLabel = new Label("Years");
      yearsLabel.relocate(350, 50);
      amountTextField = new TextField();
      amountTextField.relocate(150, 45);
      yearsTextField = new TextField();
      yearsTextField.relocate(400, 45);
      textArea = new TextArea();
      textArea.relocate(50, 100);
      textArea.setPrefWidth(600);
      textArea.setPrefHeight(500); 
      
      root.getChildren().addAll(button, amountLabel, yearsLabel, amountTextField,
         yearsTextField, textArea); 
      Scene scene = new Scene(root, 800, 700);
      stage.setScene(scene);
      stage.setTitle("Loan Table");
      stage.show();
   }
   
   public void calculateLoanTable()
   {
      String amountString = amountTextField.getText();
      String yearsString = yearsTextField.getText();
      
      try
      {
         double loanAmount = Double.parseDouble(amountString);
         int years = Integer.parseInt(yearsString);
      
         StringBuilder sb = new StringBuilder();
         sb.append("\nInterest Rate\t\tMonthly Payment\t\tTotal Payment\n");

         for(int i = 0; i < 25; i++)
         {
            double yearlyRate = 0.05 + 0.00125 * i;
            double monthlyRate = yearlyRate / 12.0;
            double payment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12.0));
            double totalPayment = payment * years * 12.0; 
            sb.append(String.format("%.3f%%\t\t\t\t$%.2f\t\t\t\t$%,.2f%n", 100 * yearlyRate, payment, totalPayment));
         }
      
         textArea.setText(sb.toString());
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.ERROR);
         alert.setTitle("Invalid Input");
         alert.setHeaderText("SOMETHING WENT WRONG!!!!");
         alert.setContentText(String.format("You entered %s which is invalid.", 
            e.getMessage().substring(e.getMessage().indexOf(":") + 2)));
         alert.showAndWait();
         
      }    
    }      
}