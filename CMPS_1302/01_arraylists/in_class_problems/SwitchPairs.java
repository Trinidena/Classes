import java.util.ArrayList;

public class SwitchPairs
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
      System.out.println(switchPairs(words));
      
      ArrayList<String> words2 = new ArrayList<String>();
      
      words2.add("to");
      words2.add("be");
      words2.add("or");
      words2.add("not");
      words2.add("to");
      words2.add("be");
      words2.add("hamlet");
      
      System.out.println(words2);
      System.out.println(switchPairs(words2));                       
   }
   
   public static ArrayList<String> switchPairs(ArrayList<String> in)
   {
      int size = in.size();
      ArrayList<String> out = new ArrayList<String>();
      
      if(size == 0)
      {
         return out;
      }
      
      if(size == 1)
      {
         out.add(in.get(0));
         return out;
      }

      for(int i = 0; i < in.size() - 1; i+=2)
      {
         out.add(in.get(i + 1));
         out.add(in.get(i));
      }
      
      if(size % 2 != 0)
      {
         out.add(in.get(size - 1));
      }
      
      return out;
   }
}