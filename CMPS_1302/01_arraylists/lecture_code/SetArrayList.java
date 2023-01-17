import java.util.ArrayList;

public class SetArrayList
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
      
      words.add("alpha"); 
      words.add("bravo"); 
      words.add("charlie"); 
      words.add("delta"); 
      words.add("echo");
      
      System.out.println("ArrayList words:  " + words);
      
      words.set(3, "foxtrot");
      words.set(2, "golf");
      words.set(4, "hotel");

      System.out.println("ArrayList words:  " + words);            
   }
}