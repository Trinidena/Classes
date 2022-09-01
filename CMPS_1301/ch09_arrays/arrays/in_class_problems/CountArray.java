import java.util.Scanner;

public class CountArray
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      double[] numbers = {2.3, 66.2, 8.2, 9.012, 45.2};
      System.out.println("Enter a number:  ");
      double input = in.nextDouble();
      
      int count = 0;
      for(int i = 0; i < numbers.length; i++)
      {
         if(numbers[i] > input)
         {
            count++;
         }
      }
      System.out.printf("There are %d numbers in the array greater than %f.", count, input);
   }
}