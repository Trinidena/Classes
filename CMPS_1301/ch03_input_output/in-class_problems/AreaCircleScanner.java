import java.util.Scanner;

class AreaCircleScanner
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter the radius of a circle.");
      double radius = in.nextDouble();
      
      double area = Math.PI * Math.pow(radius,2);
      
      System.out.printf("The area of a circle with radius %.2f " + 
         " units is %.2f square units.%n", radius, area);    
   }
}