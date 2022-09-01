import java.util.Scanner;

public class Cylinder
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a radius:  ");
      double radius = in.nextDouble();
      System.out.print("Enter the length:  ");
      double length = in.nextDouble();
      double area = computeArea(radius);
      double volume = computeVolume(area, length);
      System.out.printf("Area of base:  %f   Volume of cylinder:  %f", area, volume);
   }
   
   public static double computeArea(double radius)
   {
      return Math.PI * radius * radius;
   }
   
   public static double computeVolume(double area, double length)
   {
      return area * length;
   }
}