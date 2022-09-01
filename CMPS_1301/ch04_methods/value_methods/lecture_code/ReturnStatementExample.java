class ReturnStatementExample
{
   public static void main(String[] args)
   {
      anotherMethod(3);
      anotherMethod(5);
      anotherMethod(7);
      anotherMethod(-19);
   }
   
   public static void anotherMethod(int x)
   {
      // If the input value is 7, then return.
      if( x == 7 )
      {
         return;  
      }
      
      System.out.printf("The input value was %d.%n", x);
   }
}