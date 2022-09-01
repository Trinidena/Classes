import java.util.Scanner;

public class Chapter04PracticeProblem3
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter the price per barrel of gasoline:  ");
      double pricePerBarrel = in.nextDouble();
      
      displayRange(pricePerBarrel);      
   }
   
   public static void displayRange(double price)
   {
      double low = 3.5 * price / 100.0;
      double high = 4.0 * price / 100.0;
      
      System.out.printf("The price for one gallon of gasoline at the pump " +
         "should be between $%.2f and $%.2f.%n", low, high);
   }
}