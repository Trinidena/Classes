import java.util.*;

public class TestFullListUpdated
{
   public static void main(String[] args)
   {
      FullList<String> words = new FullList<>();
      for(int i = 0; i < 4; i++)
      {
         words.addBeginning(Character.toString((char)(i + 94)));
         words.addEnd(Character.toString((char)(120 - 2 * i)));
      }
      
      FullList<Integer> numbers = new FullList<>();
      for(int i = 0; i < 3; i++)
      {
         numbers.addEnd(9 * i - 3);
         numbers.addBeginning(4 * i * i + 2);
         numbers.addEnd(i * i - 2 * i - 1);
      }
      
      words.addMiddle(3, "m");
      words.addMiddle(0, "z");
      words.addMiddle(9, "a");
      
      numbers.addMiddle(7, 22);
      numbers.addMiddle(9, 34);
      numbers.addMiddle(0, 11);      
      
      List<String> ans1 = new LinkedList<>(
         List.of("z","a","`","_","m","^","x","v","t","a","r"));
      List<Integer> ans2 = new LinkedList<>(
         List.of(11, 18, 6, 2, -3, -1, 6, -2, 22, 15, 34, -1));
      
      try
      {
         if(words.isHeadNull())
         {
             throw new RuntimeException("Head of word is null.");           
         }
         if(words.isTailNull())
         {
             throw new RuntimeException("Tail of word is null.");           
         }
         if(numbers.isHeadNull())
         {
             throw new RuntimeException("Head of numbers is null.");           
         }
         if(numbers.isTailNull())
         {
             throw new RuntimeException("Tail of numbers is null.");           
         }                  
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
      
      System.out.println("Everything seems correct.");   
   }
}