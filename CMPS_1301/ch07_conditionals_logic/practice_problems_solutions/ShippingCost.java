import java.util.Scanner;

public class ShippingCost
{
   public static void main(String[] args)
   {      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter the distance.");
      int distance = in.nextInt();
      boolean isInputValid = true;
      
      double cost = 0;
      
      if( distance >= 0 && distance <= 100 )
      {
         cost = 5.0;
      }
      else if( distance > 100 && distance <= 500 )
      {
         cost = 8.0;
      }
      else if( distance > 500 && distance < 1000 )
      {
         cost = 10.0;
      }
      else if( distance >= 1000 )
      {
         cost = 12.0;
      }
      else
      {
         System.out.println("Invalid input.  Setting price to zero.");
         isInputValid = false;
      }
      
      if( isInputValid )
      {
         System.out.printf("The cost for shipping a distance of %d miles is $%.2f.%n", distance, cost);
      }
    }  
}