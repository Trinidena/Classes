import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;
import java.math.BigInteger;
import java.lang.StringBuilder;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PrimeNumberCheckerController {

    //List<Integer> list = new ArrayList<>();
   StringBuilder str = new StringBuilder();
    
   @FXML
    private TextArea answerTextArea;

   @FXML
    private Button button;

   @FXML
    private TextField fromTextField;

   @FXML
    private TextField toTextField;

   @FXML
    void handleButton(ActionEvent event) 
   {
      primeChecker();
      answerTextArea.setText(str.toString());
      seperateResult();
   }

   @FXML
    void handleFromTextField(ActionEvent event) 
   {
      primeChecker();
      answerTextArea.setText(str.toString());
      seperateResult();
   }

   @FXML
    void handleToTextField(ActionEvent event) 
   {
      primeChecker();
      answerTextArea.setText(str.toString());
      seperateResult();
   }
    
   public void primeChecker()
   {
      try
      {
         String from = fromTextField.getText();
         int a = Integer.parseInt(from);
         String to = toTextField.getText();
         int b = Integer.parseInt(to);
      
      
      
         int certainty = 10;
         int count = 0;
         int n = 0;
      
         for(int i = a; i <= b; i++)
         {
            BigInteger number = BigInteger.valueOf(i);
            boolean isPrime = number.isProbablePrime(certainty);
         
            if(isPrime == true)
            {
               int PrimeNumber = number.intValue();
            
               //list.add(PrimeNumber);
               str.append(PrimeNumber + ", ");
               count++;
               if(count == 20)
               {
                  str.append(System.getProperty("line.separator"));
                  count = 0;
               }
            }
         }
      }
      catch(NumberFormatException e)
      {
         Alert a = new Alert(AlertType.WARNING);
         a.setHeaderText("Invalid Input");
         a.setContentText("You have entered an invalid number(s) for your range. Enter a numeric value.\n\n" + 
                          "Doublecheck your input for any extra space before and after the number");
         a.show();
         
         str.append("Error");
         //str.append(System.getProperty("line.serperator"));
      }
      
      //answerTextArea.setText(Arrays.toString(list.toArray()));
      //answerTextArea.setText(str.toString());
   }
    
   public void seperateResult()
   {
      str.append(System.getProperty("line.separator"));
      str.append(System.getProperty("line.separator"));
   }

}
