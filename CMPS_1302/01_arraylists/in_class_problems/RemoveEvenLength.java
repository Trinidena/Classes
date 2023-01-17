import java.util.ArrayList;

public class RemoveEvenLength
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
      
      words.add("four");
      words.add("score");
      words.add("and");
      words.add("seven");
      words.add("years");
      words.add("ago");
      
      System.out.println(words);
      System.out.println(removeEvenLength(words));
      
      ArrayList<String> words2 = new ArrayList<String>();
      
      words2.add("to");
      words2.add("be");
      words2.add("or");
      words2.add("not");
      words2.add("to");
      words2.add("be");
      words2.add("hamlet");
      
      System.out.println(words2);
      System.out.println(removeEvenLength(words2));                        
   }
   
   public static ArrayList<String> removeEvenLength(ArrayList<String> in)
   {
      ArrayList<String> odds = new ArrayList<String>();
      
      for(int i = 0; i < in.size(); i++)
      {
         String word = in.get(i);
         if(word.length() % 2 != 0)
         {
            odds.add(word);
         }
      }
      
      return odds;
   }
}