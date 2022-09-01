import java.util.Scanner;

public class SearchArray
{
   public static void main(String[] args)
   {
      String[] words = {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel"};
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a word:  ");
      String userInput = in.nextLine();
      
      int index = -1;      
      for(int i = 0; i < words.length; i++)
      {
         if(userInput.equals(words[i]))
         {
            index = i;
            break;
         }
      }
      System.out.println(index);
   }
}