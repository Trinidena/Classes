package exampleone;

import javafx.beans.property.SimpleIntegerProperty;

public class ExampleOne {

	public static void main(String[] args) {
		
	      SimpleIntegerProperty p1 = new SimpleIntegerProperty(1957);	      
	      
	      System.out.println(p1);
	      System.out.println(p1.get()); //returns an int
	      System.out.println(p1.getValue()); //returns an Integer object
	      
	      p1.set(2010);
	      
	      System.out.println(p1);
	      System.out.println(p1.get());
	      System.out.println(p1.getValue());
	}
}