public class CountDown
{
   public static void main(String[] args)
   {
      countDown(10);
   }
   
   public static void countDown(int x)
   {
      if(x > 0)
      {
         System.out.println(x);
         countDown(x-1);
      }
   }
}