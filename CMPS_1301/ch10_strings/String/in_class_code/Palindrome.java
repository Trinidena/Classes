public class Palindrome
{
   public static void main(String[] args)
   {
      System.out.println(isPalindrome("banana"));
      System.out.println(isPalindrome("radar"));
      System.out.println(isPalindrome("able was i ere i saw elba"));
   }
   
   public static boolean isPalindrome(String word)
   {
      for(int i = 0; i < word.length() / 2; i++)
      {
         if(word.charAt(i) != word.charAt(word.length() - 1 - i))
         {
            return false;
         }
      }
      
      return true;
   }
}