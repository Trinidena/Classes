class LogicalOperatorsExample
{
   public static void main(String[] args)
   {
      // All possible outcomes using not.
      System.out.println( !true );
      System.out.println( !false );
      
      System.out.println();
      
      // All possible outcomes using and.
      System.out.println( true && true );
      System.out.println( true && false );
      System.out.println( false && true );
      System.out.println( false && false );   
      
      System.out.println();
      
      // All possible outcomes using or.
      System.out.println( true || true );
      System.out.println( true || false );
      System.out.println( false || true );
      System.out.println( false || false ); 
      
      System.out.println();
      
      // Examples of compound boolean expressions.
      System.out.println( 7>2 || 3==5 );
      System.out.println( 7>2 && 3==5 );
      System.out.println( 8>=7 && 4!=2 );
      System.out.println( 7<2 || 3==5 && 6==6);
      System.out.println( 7<2 && 3==5 || 6==6);                                             
   }   
}