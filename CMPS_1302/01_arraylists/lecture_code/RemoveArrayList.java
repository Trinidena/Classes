import java.util.ArrayList;

public class RemoveArrayList
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
      
      words.remove(3);
      words.remove(0);
      
      System.out.println("ArrayList words:  " + words);
            
      words.remove("charlie");

      System.out.println("ArrayList words:  " + words);            
   }
}