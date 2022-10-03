public class Factorial1
{
   public static void main(String[] args)
   {
      System.out.println(factorial(0));
      System.out.println(factorial(4));
      System.out.println(factorial(5));
      System.out.println(factorial(10));      
   }
   
   public static int factorial(int n)
   {
      if(n == 0)
      {
         return 1;
      }
      else
      {
         return n * factorial(n -1);
      }
   }
}