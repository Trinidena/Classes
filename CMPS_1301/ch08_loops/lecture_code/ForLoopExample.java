class ForLoopExample
{
   public static void main(String[] args)
   {
      // Count up by ones.
      for(int i = 0; i < 11; i++)
      {
         System.out.printf("Loop 1:  The value of i is %d.%n", i);
      }
      
      System.out.println();
      
      // Count down by ones.
      for(int i = 10; i > 0; i--)
      {
         System.out.printf("Loop 2:  The value of i is %d.%n", i);
      }
   
      System.out.println();
      
      //Count up by threes.
      for(int i = 0; i < 11; i += 3)
      {
         System.out.printf("Loop 3:  The value of i is %d.%n", i);
      }   
   }
}