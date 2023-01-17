package exampletwo;

import javafx.beans.property.SimpleStringProperty;

public class ExampleTwo {
    
	public static void main(String[] args) {
	
	SimpleStringProperty p1 = new SimpleStringProperty("flash");	      
	SimpleStringProperty p2 = new SimpleStringProperty("thunder");
    System.out.println("" + p1 + "\n" + p2);
    
    p2.bindBidirectional(p1);
    
    p1.set("alpha");
    
    System.out.println("" + p1 + "\n" + p2);
    
    p2.set("beta");
    
    System.out.println("" + p1 + "\n" + p2);
	}
}
