import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFiveIntegers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      
      System.out.print("Enter five integers:  ");
      for(int i = 0; i < 5; i++)
      {
         int number = in.nextInt();
         numbers.add(number);
      }   
      
      System.out.println(numbers);
   }
}