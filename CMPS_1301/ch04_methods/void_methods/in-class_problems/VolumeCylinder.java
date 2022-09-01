public class VolumeCylinder
{
   public static void main(String[] args)
   {
      double radius1 = 6.5;
      double height1 = 2.7;

      computeVolume(radius1, height1);
      
      double radius2 = 2.5;
      double height2 = 12.7;

      computeVolume(radius2, height2);

            
      double radius3 = 0.5;
      double height3 = 1.6;            

      computeVolume(radius3, height3);
     
   }
   
   public static void computeVolume(double radius, double height)
   {
      double volume = Math.PI * Math.pow(radius,2.0) * height;
      System.out.printf("The volume of a cylinder with radius %.2f " + 
          "units and height %.2f units is %.2f units cubed.%n", radius, height, volume);      
   }
}