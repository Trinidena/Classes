import java.util.ArrayList;

public class InsertingElementsIntoArrayLists
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
      
      System.out.println("ArrayList words:  " + words);
      words.add("alpha"); // Inserts alpha at the end of the ArrayList words.
      System.out.println("ArrayList words:  " + words); 
      words.add("bravo"); // Inserts bravo at the end of the ArrayList words.
      words.add("charlie"); // Inserts charlie at the end of the ArrayList words.
      System.out.println("ArrayList words:  " + words);  
      words.add(0, "delta"); // Inserts delta into the ArrayList words at index 0.
      System.out.println("ArrayList words:  " + words); 
      words.add(2, "echo"); // Inserts echo into the ArrayList words at index 2.
      System.out.println("ArrayList words:  " + words);
      System.out.println(words.size());                    
      ArrayList<Integer> wholeNumbers = new ArrayList<Integer>();
      wholeNumbers.add(9);
      wholeNumbers.add(8);
      wholeNumbers.add(1,17);
      System.out.println(wholeNumbers);
      
      ArrayList<MyPoint> points = new ArrayList<MyPoint>(); 
      points.add(new MyPoint(1,2));
      points.add(new MyPoint(3,4));
      points.add(new MyPoint(5,6));
      points.add(new MyPoint(7,8));
      points.add(2, new MyPoint(9,10));                  
      System.out.println(points);
   }
}