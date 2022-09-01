class BreakContinueExample
{
   public static void main(String[] args)
   {
      // Loop terminates when i == 5.
      for(int i = 0; i < 11; i++)
      {
         if( i == 5 )
         {
            break;
         }
         
         System.out.printf("Loop 1:  The value of i is %d.%n", i );
      }
      
      System.out.println();
      
      // Loop skips the iteration when i == 5.
      for(int i = 0; i < 11; i++)
      {
         if( i == 5 )
         {
            continue;
         }
         
         System.out.printf("Loop 2:  The value of i is %d.%n", i );
      }
      
   }
}