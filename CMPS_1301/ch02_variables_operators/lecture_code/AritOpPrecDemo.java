public class AritOpPrecDemo
{
   public static void main(String[] args)
   { 
      // Multiplication done first.
      System.out.println( 7 + 5 * 3 );
      
      // Parentheses alter the order of operations.
      System.out.println( (7 + 5) * 3 );
      
      System.out.println();
      
      // Integer division done first.
      System.out.println( 7 + 5 / 3 );
      
      System.out.println();
      
      // Remainder operator done first.
      System.out.println( 7 % 5 + 3 );
      
      System.out.println();
      
      /* Operators all have the same precedence so done in 
         order from left to right. */
         
      System.out.println( 196 % 43 * 8 / 8);     
       
   }
}