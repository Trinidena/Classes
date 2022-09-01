public class CompoundInterest
{
   public static void main(String[] args)
   {
      double p = 7000.0;
      double r = 0.08;
      double a = 0.0;
      double n = 1.0;
      
      for(int i = 0; i < 121; i++)
      {
         System.out.printf("Month:  %d  Amount:  $%.2f%n", i, p * Math.pow( 1 + r / n , i ) );
      }
   }
}