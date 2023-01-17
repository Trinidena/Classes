import java.util.ArrayList;

public class Replicate
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
      
      words.add("how");
      words.add("are");
      words.add("you?");
      
      System.out.println(words);
      System.out.println(replicate(4, words));
      
      ArrayList<String> words2 = new ArrayList<String>();
      
      words2.add("to");
      words2.add("be");
      words2.add("or");
      words2.add("not");
      words2.add("to");
      words2.add("be");
      words2.add("hamlet");
      
      System.out.println(words2);
      System.out.println(replicate(4, words2)); 
      System.out.println(replicate(0, words2));     
      System.out.println(replicate(-3, words2));                           
   }
   
   public static ArrayList<String> replicate(int k, ArrayList<String> in)
   {
      ArrayList<String> out = new ArrayList<String>();
            
      for(int i = 0; i < in.size(); i++)
      {
         String word = in.get(i);
         for(int j = 0; j < k; j++)
         {
            out.add(word);
         }   
      }
      
      return out;
   }
}