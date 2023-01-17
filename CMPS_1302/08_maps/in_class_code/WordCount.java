import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount extends Application
{
   @FXML TextField fileBox;
   @FXML Button goButton;
   @FXML TextArea textBox;
   @FXML TextArea statBox;
   
   @FXML protected void handleGoButton(ActionEvent e)
   {
      Stage newStage = new Stage();
      FileChooser fileChooser = new FileChooser();
      File file = fileChooser.showOpenDialog(newStage);
      fileBox.setText(file.toString()); 
      getFileContents(file.toString());
      processText();  
   }
   
   private void processText()
   {
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      String[] words = textBox.getText().split(" ");
      for(String word : words)
      {
         if(map.containsKey(word))
         {
            map.put(word, map.get(word) + 1);
         }
         else
         {
            map.put(word,1);
         }
      }
      
      String outString = "";
      Set<Map.Entry<String, Integer>> entries = map.entrySet();
      for(Map.Entry<String, Integer> entry : entries)
      {
         outString = outString + String.format("%-15s %d%n",
            entry.getKey(), entry.getValue());
      }
      
      statBox.setText(outString);   
   }
   
   private void getFileContents(String fileName)
   {
      String text = "";
      try(FileReader fr = new FileReader(fileName);
          BufferedReader br = new BufferedReader(fr))
      {
         String line = br.readLine();
         while(line != null)
         {
            text = text + line;
            line = br.readLine();
         }
         //System.out.print(text);
        
         textBox.setText(text);
       }
      catch(FileNotFoundException e)
      {
         e.printStackTrace();
         System.exit(0);
      }
      catch(IOException e)
      {
         e.printStackTrace();
         System.exit(0);
      }   
   }
   
   @Override
   public void start(Stage stage) throws IOException
   {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("word_count.fxml"));
         loader.setController(this);
         Parent root = loader.load();
         
         Scene scene = new Scene(root);
         stage.setScene(scene);
         stage.show();              
   } 
}