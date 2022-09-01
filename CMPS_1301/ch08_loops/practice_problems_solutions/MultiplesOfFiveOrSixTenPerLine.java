public class MultiplesOfFiveOrSixTenPerLine
{
   public static void main(String[] args)
   {
      int count = 0;
      for(int i = 1; i < 1001; i++)
      {
         if(i % 5 == 0 || i % 6 == 0)
         {
            System.out.printf("%d ", i);
            count++;
            
            if(count % 10 == 0)
            {
               System.out.println();
            }
         }     
      }
   }
}