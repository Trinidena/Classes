import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;
import java.math.BigInteger;
import java.lang.StringBuilder;

public class PrimeNumberCheckerController {

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
    }

    @FXML
    void handleFromTextField(ActionEvent event) 
    {
      primeChecker();
    }

    @FXML
    void handleToTextField(ActionEvent event) 
    {
      primeChecker();
    }
    
    public void primeChecker()
    {
      String from = fromTextField.getText();
      int a = Integer.parseInt(from);
      String to = toTextField.getText();
      int b = Integer.parseInt(to);
      
      //List<Integer> list = new ArrayList<>();
      StringBuilder str = new StringBuilder();
      int certainty = 10;
      int count = 0;
      
      for(int i = a + 1; i < b; i++)
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
      
      //answerTextArea.setText(Arrays.toString(list.toArray()));
      answerTextArea.setText(str.toString());
    }

}
