public class PrintCharacters
{
   public static void main(String[] args)
   {
      printCharacters("banana");
      System.out.println();   
      printCharactersReverse("banana");
      System.out.println();
      printCharacters("");
      System.out.println();   
      printCharactersReverse("");
      System.out.println();
      printCharacters(null);
      System.out.println();   
      printCharactersReverse(null);                        
   }
   
   public static void printCharacters(String word)
   {
      if(word == null)
      {
         System.out.println("The string is null.");
         return;
      }
      
      if(word.length() == 0)
      {
         System.out.println("The string is empty.");
         return;         
      }
      
      for(int i = 0; i < word.length(); i++)
      {
         System.out.println(word.charAt(i));
      }   
   }
   
   public static void printCharactersReverse(String word)
   {
      if(word == null)
      {
         System.out.println("The string is null.");
         return;
      }
      
      if(word.length() == 0)
      {
         System.out.println("The string is empty.");
         return;         
      }
     
      for(int i = word.length() - 1; i > -1; i--)
      {
         System.out.println(word.charAt(i));
      }   
   }  
}