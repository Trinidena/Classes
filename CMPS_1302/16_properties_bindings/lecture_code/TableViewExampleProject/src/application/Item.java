package application;

public class Item {

	private String word;
	private int number;
	
	public Item(String word, int number) {
		this.word = word;
		this.number = number;
	}
	
	public String getWord() {
		return word;
	}

	public int getNumber() {
		return number;
	}
}