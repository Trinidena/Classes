public class IsPalindrome
{
   public static void main(String[] args)
   {
      System.out.println(isPalindrome("radar"));
      System.out.println(isPalindrome("ablewasiereisawelba"));
      System.out.println(isPalindrome("madamimadam"));
      System.out.println(isPalindrome("whatever"));
      System.out.println(isPalindrome("madam i'm adam"));
   }
   
   public static boolean isPalindrome(String s)
   {
      if( s.length() < 2)
      {
         return true;
      }
      else
      {
         if(s.charAt(0) != s.charAt(s.length() - 1))
         {
            return false;
         }
         else
         {
            return isPalindrome(s.substring(1, s.length() - 1));
         }
      }     
   }
}