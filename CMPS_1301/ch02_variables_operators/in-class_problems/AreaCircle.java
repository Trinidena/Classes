public class AreaCircle
{
   public static void main(String[] args)
   {
      double area = 0;
      double radius = 3.4;
      
      area = Math.PI * Math.pow(radius,2);
      
      System.out.println("The area of a circle with radius " + radius + 
         " units is " + area + " square units.");    
   }
}