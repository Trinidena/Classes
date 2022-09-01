import java.util.Scanner;

public class Average
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter an integer:  ");
      int int1 = in.nextInt();
      System.out.print("\nEnter another integer:  ");
      int int2 = in.nextInt();
      double avg = computeAverage(int1, int2);
      System.out.printf("%nThe average of %d and %d is %.2f%n", 
         int1, int2, avg);
   }
   
   public static double computeAverage(int x, int y)
   {
      return (x + y) / 2.0;
   }
}