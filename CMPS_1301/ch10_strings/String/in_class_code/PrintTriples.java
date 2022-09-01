public class PrintTriples
{
   public static void main(String[] args)
   {
      printTriples("This is a sentence.");
      System.out.println();   
      printTriplesReverse("This is a sentence.");
      System.out.println();
      printTriples("ya");
      System.out.println();   
      printTriplesReverse("ya");                      
   }
   
   public static void printTriples(String word)
   {
      if(word.length() < 3)
      {
         System.out.println(word);
         return;
      }
            
      for(int i = 0; i < word.length()-2; i++)
      {
         System.out.println(word.substring(i, i + 3));
      }   
   }
   
   public static void printTriplesReverse(String word)
   {
      if(word.length() < 3)
      {
         System.out.println(word);
         return;
      }
           
      for(int i = word.length() - 3; i > -1; i--)
      {
         System.out.println(word.substring(i, i + 3));
      }   
   }  
}