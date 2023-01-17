import java.util.ArrayList;

public class PoemDemo
{
   public static void main(String[] args)
   {
      ArrayList<Poem> poems = new ArrayList<Poem>();
      
      poems.add(new Poem("If-", 32)); 
      poems.add(new Haiku("Haiku 10"));
      poems.add(new Limerick("Limerick 17"));
      poems.add(new Sonnet("Sonnet 18"));
      
      // Enhanced for loop
      for(Poem poem : poems)
      {
         System.out.println(poem);
      }       
   }
}