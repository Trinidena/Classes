import java.util.Random;
import java.util.Arrays;

public class FindMaximum
{
   public static void main(String[]args)
   {
      Random rnd = new Random();
      int[] numbers = new int[10];
      
      for(int i = 0; i < numbers.length; i++)
      {
         numbers[i] = rnd.nextInt(100);
      }
      
      System.out.println(Arrays.toString(numbers));
      
      int max = numbers[0];
      for(int i = 1; i < numbers.length; i++)
      {
         if(numbers[i] > max)
         {
            max = numbers[i];
         }
      } 
      
      System.out.printf("The largest element is %d.", max);
   }
}