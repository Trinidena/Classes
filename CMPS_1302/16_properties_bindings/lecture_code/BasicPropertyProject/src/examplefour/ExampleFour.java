package examplefour;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

public class ExampleFour {

	public static void main(String[] args) {
		
		SimpleListProperty<String> wordsOne = 
				new SimpleListProperty<String>(FXCollections.observableArrayList());
		
		SimpleListProperty<String> wordsTwo = 
				new SimpleListProperty<String>(FXCollections.observableArrayList());

		// Also try bindContentBidirectional.
		Bindings.bindContent(wordsOne, wordsTwo);
		
		wordsOne.add("alpha");
		wordsOne.add("bravo");
		
		System.out.println(wordsOne.getValue());
		System.out.println(wordsTwo.getValue());
		System.out.println();
		
		wordsTwo.add("delta");
		wordsTwo.add("echo");		
		System.out.println(wordsOne.getValue());		
		System.out.println(wordsTwo.getValue());
		System.out.println();	
	}
}