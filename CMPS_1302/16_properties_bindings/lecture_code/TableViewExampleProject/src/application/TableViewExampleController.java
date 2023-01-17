package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewExampleController {

	private TableViewExampleModel model = new TableViewExampleModel();
	 
	@FXML
    private TableView<Item> tableView;

    @FXML
    private TableColumn<Item, String> wordColumn;

    @FXML
    private TableColumn<Item, Integer> numberColumn;

    @FXML
    private TextField wordField;

    @FXML
    private TextField numberField;
    
    @FXML
    void handleTextField(ActionEvent event) {
    	
    	String word = wordField.getText();
    	if(word.length() < 1) {
    		return;
    	}
    	
    	int number = 0;
    	try {
    		number = Integer.parseInt(numberField.getText());
    	}
    	catch(NumberFormatException e) {
    		return;
    	}
    	
    	model.update(word, number);
    	wordField.setText("");
    	numberField.setText("");
    }
    
    @FXML
    public void initialize() {
    	tableView.itemsProperty().bind(model.getItemList());
    	wordColumn.setCellValueFactory(new PropertyValueFactory<Item, String>("word"));
    	numberColumn.setCellValueFactory(new PropertyValueFactory<Item, Integer>("number"));
    }
}