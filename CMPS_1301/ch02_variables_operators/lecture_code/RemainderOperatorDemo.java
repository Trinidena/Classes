public class RemainderOperatorDemo
{
   public static void main(String[] args)
   { 
      // int operands
      // Notice result is of type int.
       
      System.out.println( 7 % 5 );
      System.out.println( 5 % 7 );
      System.out.println( -34 % 4 );  // Not consistent with mathematical definition.
      System.out.println( 34 % -4 );  // Not consistent with mathematical definition.
      System.out.println( 0 % 5 );
      //System.out.println( 5 % 0 ); //Will cause runtime error if uncommented.
      
      System.out.println(); 
      
      // Can be used with double operands, but is extremely rare.
      // Notice result is of type double.
      
      System.out.println(5.0 % 7.0);
      System.out.println(7.0 % 5.0);
      System.out.println(2345.67 % 72.9);     
       
   }
}