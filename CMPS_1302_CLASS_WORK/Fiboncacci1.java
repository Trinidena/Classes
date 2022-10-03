public class Fiboncacci1
{
   public static void main(String[] args)
   {
      System.out.println(fibonacci(1));
      System.out.println(fibonacci(2));
      System.out.println(fibonacci(4));
      System.out.println(fibonacci(10));

   }
   
   public static int fibonacci(int n)
   {
      if(n == 1)
      {
         return 0;
      }
      else if(n == 2)
      {
         return 1;
      }
      else
      {
         return fibonacci(n-1) + fibonacci(n-2);
      }
   }
}