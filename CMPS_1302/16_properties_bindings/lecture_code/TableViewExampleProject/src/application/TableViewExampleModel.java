package application;

import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

public class TableViewExampleModel {

	private SimpleListProperty<Item> itemList = 
			new SimpleListProperty<Item>(FXCollections.observableArrayList());
	
	public void update(String word, int number) {
		itemList.add(new Item(word, number));
	}

	public SimpleListProperty<Item> getItemList() {
		return itemList;
	}
}