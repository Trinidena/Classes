import java.util.ArrayList;
import java.util.List;

public class Switcheroo
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<>(
         List.of("four" , "scour" , "and" , "seven" , "years" , "ago"));
      
      ArrayList<String> moreWords = new ArrayList<>(
         List.of("to" , "be" , "or" , "not" , "to" , "be" , "hamlet"));
         
      System.out.println(switchWords(words));
      System.out.println(switchWords(moreWords));
      System.out.println(removeEvenLength(words));
      System.out.println(removeEvenLength(moreWords));
      System.out.println(replicate(words, -1));
      System.out.println(replicate(words, 0));
      System.out.println(replicate(words, 1));
      System.out.println(replicate(words, 2));
      System.out.println(replicate(words, 3));
   }
   
   public static ArrayList<String> replicate(ArrayList<String> a , int k)
   {
      ArrayList<String> out = new ArrayList<>();
      
      for(String word : a)
      {
         for(int i = 0; i < k; i++)
         {
         out.add(word);
         }
      }
      
      return out;
   }
   public static ArrayList<String> removeEvenLength(ArrayList<String> a)
   {
      ArrayList<String> out = new ArrayList<>();
      
      for(String word : a)
      {
         if(word.length() % 2 != 0)
         {
            out.add(word);
         }
      }
      
      return out;
   }
   
   public static ArrayList<String> switchWords(ArrayList<String> a)
   {
      ArrayList<String> out = new ArrayList<>();
      
      for(int i = 0; i < a.size(); i+= 2)
      {
         if(i + 1 < a.size())
         {
         out.add(a.get(i + 1));
         }
         out.add(a.get(i));
      }
      return out;
   }
}