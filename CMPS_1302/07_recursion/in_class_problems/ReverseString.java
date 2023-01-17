public class ReverseString
{
   public static void main(String[] args)
   {
      System.out.println(reverseString("banana"));
      System.out.println(reverseString("This is a sentence."));
   }
   
   public static String reverseString(String in)
   {
      //System.out.println(in);
      if(in.length() == 1)
      {
         return in;
      }
      else
      {
         return in.charAt(in.length() - 1) + reverseString(in.substring(0, in.length() - 1));
      }
   }
}