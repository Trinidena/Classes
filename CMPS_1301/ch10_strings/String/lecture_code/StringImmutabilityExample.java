import java.util.Arrays;

class StringImmutabilityExample
{
   public static void main(String[] args)
   {
      /* Strings are immutable.  Changing the string
         will result in an entirely new string being
         created in an entirely new memory location. */
         
      String val1 = "blah";
      
      System.out.println("val1:  " + val1);
      System.out.println("Memory address of val1:  " + 
         Integer.toHexString(System.identityHashCode( val1 )) );
      
      val1 = val1 + "yadda";  
      System.out.println("\nval1:  " + val1);             
      System.out.println("Memory address of val1:  " + 
         Integer.toHexString(System.identityHashCode( val1 )) );
      
      val1 = val1 + "whatever";
      System.out.println("\nval1:  " + val1);               
      System.out.println("Memory address of val1:  " + 
         Integer.toHexString(System.identityHashCode( val1 )) );     
      
      val1 = val1.toUpperCase();         
      System.out.println("\nval1:  " + val1);      
      System.out.println("Memory address of val1:  " + 
         Integer.toHexString(System.identityHashCode( val1 )) );         
      
      System.out.println("\nTom G draw some state diagrams for above.\n");
                   
      /* Arrays are mutable.  Changing the array will 
         not result in an entirely new array. */
         
      int[] array1 = { 1, 2, 3 };
            
      System.out.println( Arrays.toString( array1 ) ); 
      System.out.println("Memory address of array1:  " + array1);
      
      array1[0] = 999;
      System.out.println( "\n" + Arrays.toString( array1 ) );  
      System.out.println("Memory address of array1:  " + array1);

      array1[1] = -34;
      System.out.println( "\n" + Arrays.toString( array1 ) );  
      System.out.println("Memory address of array1:  " + array1);

      array1[2] = 0;
      System.out.println( "\n" + Arrays.toString( array1 ) );  
      System.out.println("Memory address of array1:  " + array1);

      System.out.println();
            
      /* Arrays are mutable, so you can change arrays without
         using the assignment operator. */
      System.out.println( Arrays.toString( array1 ) );
      Arrays.sort( array1 );
      System.out.println( Arrays.toString( array1 ) ); // array1 is changed.
      System.out.println();
      
      /* Strings are immutable, so you have to involve the assignment
         operator if you want to "change" the string. */
            
      System.out.println(val1);
      val1.toLowerCase();
      System.out.println(val1); // val1 is not changed.
       
      System.out.println();
      
      System.out.println(val1);
      val1 = val1.toLowerCase();
      System.out.println(val1); // val1 is changed.          
   }
}