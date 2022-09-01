public class SumFromOnetoOneThousand
{
   public static void main(String[] args)
   {
      int total = 0;
      for(int i = 1; i < 1001; i++)
      {
         total = total + i;
      }
      System.out.printf("%nSum:  %d%n", total);   
   }
}