import java.util.Scanner;

public class QuotientRemainder
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a non-negative integer:  ");
      int int1 = in.nextInt();
      System.out.print("Enter a positive integer:  ");
      int int2 = in.nextInt();
      
      int quotient = computeQuotient(int1, int2);
      int remainder = computeRemainder(int1, int2);
      
      System.out.printf("The quotient of %d and %d is %d.  The remainder when " +
         "%d is divided by %d is %d.%n", int1, int2, quotient, int1, int2, remainder);
   }
   
   public static int computeQuotient(int x, int y)
   {
      return x / y;
   }
   
   public static int computeRemainder(int x, int y)
   {
      return x % y;
   }   
}