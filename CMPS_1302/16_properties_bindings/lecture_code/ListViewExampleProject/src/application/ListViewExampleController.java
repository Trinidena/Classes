package application; 

import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListViewExampleController {
	
	private SimpleListProperty<String> wordList =
			new SimpleListProperty<String>(FXCollections.observableArrayList());
	
    @FXML
    private ListView<String> listView;

    @FXML
    private TextField textField;

    @FXML
    void handleTextField(ActionEvent event) {
    	wordList.add(textField.getText());
    	textField.setText("");
    }
    
    @FXML
    void initialize() {
    	listView.itemsProperty().bind(wordList);
    }
}