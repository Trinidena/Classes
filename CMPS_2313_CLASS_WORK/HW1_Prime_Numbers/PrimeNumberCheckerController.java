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

   StringBuilder str = new StringBuilder();
   int a = 0;
   int b = 0;
   int certainty = 10;
   int count;
   int n;
   
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
      stringToInteger();
      if(a < b)
      {
         fromToCheck();
      }
      else
      {
         toFromCheck();
      }
      answerTextArea.setText(str.toString());
      seperateResult();
   }

   @FXML
    void handleFromTextField(ActionEvent event) 
   {
      stringToInteger();
      if(a < b)
      {
         fromToCheck();
      }
      else
      {
         toFromCheck();
      }
      answerTextArea.setText(str.toString());
      seperateResult();
   }

   @FXML
    void handleToTextField(ActionEvent event) 
   {
      stringToInteger();
      if(a < b)
      {
         fromToCheck();
      }
      else
      {
         toFromCheck();
      }
      answerTextArea.setText(str.toString());
      seperateResult();
   }
       
   public void seperateResult()
   {
      str.append(System.getProperty("line.separator"));
      str.append(System.getProperty("line.separator"));
   }
   
   public void stringToInteger()
   {
      try
      {  
         String from = fromTextField.getText();
         a = Integer.parseInt(from);
         String to = toTextField.getText();
         b = Integer.parseInt(to);
      }
      catch(NumberFormatException e)
      {
         Alert a = new Alert(AlertType.WARNING);
         a.setHeaderText("Invalid Input");
         a.setContentText("You have entered an invalid number(s) for your range. Enter a numeric value.\n\n" + 
                          "Doublecheck your input for any extra space before and after the number");
         a.show();
         
         str.append("Error");
      }
   }
   
   public void fromToCheck()
   {
      for(int i = a; i <= b; i++)
      {
         BigInteger number = BigInteger.valueOf(i);
         boolean isPrime = number.isProbablePrime(certainty);
         
         if(isPrime == true)
         {
            int PrimeNumber = number.intValue();
            str.append(PrimeNumber + ", ");
            count++;
               
            if(count >= 22)
            {
               str.append(System.getProperty("line.separator"));
               count = 0;
            }
         }
      }
      count = 0;
   }
   
   public void toFromCheck()
   {
      for(int i = a; i >= b; i--)
      {
         BigInteger number = BigInteger.valueOf(i);
         boolean isPrime = number.isProbablePrime(certainty);
         
         if(isPrime == true)
         {
            int PrimeNumber = number.intValue();
            str.append(PrimeNumber + ", ");
            count++;
               
            if(count >= 22)
            {
               str.append(System.getProperty("line.separator"));
               count = 0;
            }
         }
      }
      count = 0;
   }

}
