import java.util.Scanner;

public class VolumeSquarePyramid
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the side length of the base of the square pyramid:  ");
      double base = in.nextDouble();
      System.out.print("\nEnter the height of the square pyramid:  ");
      double height = in.nextDouble();
      double volume = computeVolume(base, height);
      System.out.printf("%nThe volume of a square pyramid with base length of %.2f " +
         " units and height %.2f units is %.2f square units.%n", 
         base, height, volume);
   }
   
   public static double computeVolume(double b, double h)
   {
      return b * b * h / 3.0;
   }
}