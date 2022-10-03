public class PrintReverse1
{
   public static void main(String[] args)
   {
      printReverse("");
      System.out.println();
      printReverse("a");
      System.out.println();
      printReverse("ab");
      System.out.println();
      printReverse("abc");
      System.out.println();
      printReverse("abcd");
      System.out.println();
      printReverse("Able was ere I ere saw Elba");
   }
   
   public static void printReverse(String word)
   {
      if(word.length() < 2)
      {
         System.out.print(word);
      }
      else
      {
         printReverse(word.substring(1));
         System.out.print(word.charAt(0));
      }
   }
}