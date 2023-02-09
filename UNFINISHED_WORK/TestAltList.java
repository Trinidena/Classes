import java.util.*;

public class TestAltList
{
   public static void main(String[] args)
   {
      AltList<String> words = new AltList<>();
      for(int i = 0; i < 4; i++)
      {
         words.addBeginning(Character.toString((char)(i + 94)));
         words.addEnd(Character.toString((char)(120 - 2 * i)));
      }
      
      AltList<Integer> numbers = new AltList<>();
      for(int i = 0; i < 3; i++)
      {
         numbers.addEnd(9 * i - 3);
         numbers.addBeginning(4 * i * i + 2);
         numbers.addEnd(i * i - 2 * i - 1);
      }
      
      List<String> ans1 = new LinkedList<>(
         List.of("a","`","_","^","x","v","t","r"));
      List<Integer> ans2 = new LinkedList<>(
         List.of(18, 6, 2, -3, -1, 6, -2, 15, -1));
      
      try
      {
         if(words.size() != ans1.size())
         {
            throw new RuntimeException("Size of words is incorrect.");
         }
        
         if(numbers.size() != ans2.size())
         {
            throw new RuntimeException("Size of numbers is incorrect.");
         } 
         
         for(int i = 0; i < ans1.size(); i++)
         {
            if(!(words.get(i).equals(ans1.get(i))))
            {
               throw new RuntimeException("Words: Element at index " + i + " is " + 
                  words.get(i) + " but should be " + ans1.get(i) + ".");
            }
         }
         
         for(int i = 0; i < ans2.size(); i++)
         {
            if(!(numbers.get(i).equals(ans2.get(i))))
            {
               throw new RuntimeException("Numbers: Element at index " + i + " is " + 
                  numbers.get(i) + " but should be " + ans2.get(i) + ".");
            }
         }
      }
      catch(RuntimeException e)
      {
         System.out.println(e.getMessage());
         return;
      }
      
      System.out.println("Everything is correct.");   
   }
}