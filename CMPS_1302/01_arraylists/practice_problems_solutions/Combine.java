import java.util.ArrayList;

public class Combine
{
   public static void main(String[] args)
   {
      ArrayList<String> words1 = new ArrayList<String>();
      
      words1.add("the");
      words1.add("a");
      words1.add("an");
      
      ArrayList<String> words2 = new ArrayList<String>();      
      words2.add("man");
      words2.add("plan");
      words2.add("animal");
      
      System.out.println(combine(words1, words2));
   }
   
   public static ArrayList<String> combine(ArrayList<String> a, ArrayList<String> b)
   {
      ArrayList<String> c = new ArrayList<String>();
      
      for(int i = 0; i < a.size(); i++)
      {
         c.add(a.get(i));
         c.add(b.get(i));
      }
      
      return c; 
   }
}