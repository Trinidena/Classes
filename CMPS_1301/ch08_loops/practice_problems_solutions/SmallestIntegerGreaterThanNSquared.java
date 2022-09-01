import java.util.Scanner;

public class SmallestIntegerGreaterThanNSquared
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter a positive ingeter.");
      int num = in.nextInt();
      
      int i = 0; 
      while(i * i < num)
      {
         i++;
      }
      
      System.out.printf("%d is the smallest integer whose square is greater than %d.%n",
         i, num);      
   }
}