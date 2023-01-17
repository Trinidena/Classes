import java.util.ArrayList;

public class DoubleList
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
      
      words.add("how");
      words.add("are");
      words.add("you?");
      
      System.out.println(words);
      System.out.println(doubleList(words));
      
      ArrayList<String> words2 = new ArrayList<String>();
      
      words2.add("to");
      words2.add("be");
      words2.add("or");
      words2.add("not");
      words2.add("to");
      words2.add("be");
      words2.add("hamlet");
      
      System.out.println(words2);
      System.out.println(doubleList(words2));                        
   }
   
   public static ArrayList<String> doubleList(ArrayList<String> in)
   {
      ArrayList<String> out = new ArrayList<String>();
      
      for(int i = 0; i < in.size(); i++)
      {
         String word = in.get(i);
         out.add(word);
         out.add(word);
      }
      
      return out;
   }
}