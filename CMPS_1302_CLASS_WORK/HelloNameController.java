import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class HelloNameController {

   ArrayList<String> names = new ArrayList<>();

    @FXML
    private Button button;

    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    @FXML
    void handleButton(ActionEvent event) {
      names.add(textField.getText());
      String string = "";
      for(String name : names)
      {
         string = string + "Hello " + name + "!\n";
      }
      textArea.setText(string);
    }

    @FXML
    void handleTextField(ActionEvent event) {
      handleButton(event);
    }

}
