import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;
import java.math.BigInteger;

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
      String from = fromTextField.getText();
      int a = Integer.parseInt(from);
      String to = toTextField.getText();
      int b = Integer.parseInt(to);
      
      List<Integer> list = new ArrayList<>();
      int certainty = 10;
      
      for(int i = a + 1; i < b; i++)
      {
         BigInteger number = BigInteger.valueOf(i);
         boolean isPrime = number.isProbablePrime(certainty);
         
         if(isPrime == true)
         {
            int PrimeNumber = number.intValue();
            
            list.add(PrimeNumber);
         }
      }
      
      answerTextArea.setText(Arrays.toString(list.toArray()));

    }

    @FXML
    void handleFromTextField(ActionEvent event) 
    {

    }

    @FXML
    void handleToTextField(ActionEvent event) 
    {

    }

}
