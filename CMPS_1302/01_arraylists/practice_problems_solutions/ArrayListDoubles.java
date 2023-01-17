import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDoubles
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      ArrayList<Double> numbers = new ArrayList<Double>();
      
      System.out.println("Enter a number.");
      double number = in.nextDouble();
      
      numbers.add(number);
      
      System.out.println(numbers);
   }
}