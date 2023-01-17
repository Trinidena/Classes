package examplethree;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;

public class ExampleThree {
		
	public static void main(String[] args) {
		SimpleIntegerProperty p1 = new SimpleIntegerProperty(4);
		SimpleIntegerProperty p2 = new SimpleIntegerProperty(5);
		
		NumberBinding b1 = Bindings.multiply(p1, p2);
		System.out.println(b1.getValue());
		p1.set(5);
		System.out.println(b1.getValue());		
	}
}