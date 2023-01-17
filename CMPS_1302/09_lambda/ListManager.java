import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.ArrayList;

public class ListManager extends Application
{
   private ArrayList<Integer> list = new ArrayList<Integer>();
   
   @FXML private TextField listBox;
   @FXML private TextField addBox;
   @FXML private TextField removeBox;
   @FXML private Button doubleButton;
   @FXML private Button squareButton;
   @FXML private Button reverseButton;
   @FXML private Button clearButton;
   
   @FXML protected void handleAddBox(ActionEvent e)
   {
      String numberString = addBox.getText();
      int number = Integer.parseInt(numberString);
      list.add(number);
      listBox.setText(list.toString());
   }
   
   @FXML protected void handleRemoveBox(ActionEvent e)
   {
      String numberString = removeBox.getText();
      int number = Integer.parseInt(numberString);
      list.removeIf(n -> n == number);
      listBox.setText(list.toString());   
   }
         
   @FXML protected void handleDoubleButton(ActionEvent e)
   {
      list.replaceAll(n -> 2 * n);
      listBox.setText(list.toString());
   }

   @FXML protected void handleSquareButton(ActionEvent e)
   {
      list.replaceAll(n -> 2 * n);
      listBox.setText(list.toString());   
   }
   
   @FXML protected void handleReverseButton(ActionEvent e)
   {
      list = reverseList(list);
      listBox.setText(list.toString());
   }
   
   @FXML protected void handleClearButton(ActionEvent e)
   {
      list.removeIf(n -> true);
      listBox.setText(list.toString());      
   } 
   
   private ArrayList<Integer> reverseList(ArrayList<Integer> in)
   {
      if(in.size() == 0)
      {
         return new ArrayList<Integer>();
      }
      else
      {
         int firstElement = in.get(0);
         ArrayList<Integer> aList = in;
         aList.remove(0);
         aList = reverseList(aList);
         aList.add(firstElement);
         return aList;
      }
   }
           
   @Override
   public void start(Stage stage) throws IOException
   {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("list_manager.fxml"));
         loader.setController(this);
         Parent root = loader.load();
         
         Scene scene = new Scene(root);
         stage.setTitle("List Manager");
         stage.setScene(scene);
         stage.show();              
   } 
}