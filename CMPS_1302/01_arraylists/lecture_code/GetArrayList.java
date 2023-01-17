import java.util.ArrayList;

public class GetArrayList
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
      
      String s = words.get(3);
      System.out.println(s);
      
      s = words.get(4);
      System.out.println(s);
      
      s = words.get(0);
      System.out.println(s);            
   }
}