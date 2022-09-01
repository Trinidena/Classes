class RelationalOperatorsExample
{
   public static void main(String[] args)
   {
      
      System.out.println( 5 == 3 );
      System.out.println( 5 != 3 );
      System.out.println( 5 > 3 );
      System.out.println( 5 < 3 );
      System.out.println( 5 >= 3 );
      System.out.println( 5 <= 3 );
      
      int num1 = 9;
      int num2 = 9;
      System.out.println( num1 == num2 );
      System.out.println( num1 != num2 );
      System.out.println( num1 > num2 );
      System.out.println( num1 < num2 );
      System.out.println( num1 >= num2 );
      System.out.println( num1 <= num2 );  
      
      // Automatic Type Promotion
      System.out.println( 17 > 8.6 );
      
      // Strings are not compatible with numeric types.
      // System.out.println( 5 == "5" );    
   }
}