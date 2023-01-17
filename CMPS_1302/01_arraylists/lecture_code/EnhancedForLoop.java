import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

class EnhancedForLoop
{
   public static void main(String[] args)
   {
      // Create an array and an arraylist with random numbers.
      
      Random rnd = new Random();
            
      int[] randomInts = new int[rnd.nextInt(11) + 10];
      
      for( int i = 0; i < randomInts.length; i++)
      {
         randomInts[i] = rnd.nextInt(10);
      }
      
      System.out.println( Arrays.toString( randomInts ) );
      
      ArrayList<Integer> randomList = new ArrayList<Integer>();
      
      int randomInt =  rnd.nextInt(11) + 10;
      
      for( int i = 0; i < randomInt; i++)
      {
         randomList.add(rnd.nextInt(10));
      }
      
      System.out.println( randomList ); 
      
      
      // Enhanced For Loops 
      for( int value : randomInts)
      {
         System.out.print( value + " " );
      }
      
      System.out.println();
      
      for( int value: randomList )
      {
         System.out.print( value + " " );
      } 
         
      
     
   }
}