public class TestMyPoint
{
   public static void main(String[] args)
   {
      // Create two MyPoint objects.
      MyPoint point1 = new MyPoint();
      MyPoint point2 = new MyPoint();
      
      // Set the value of each field in each object.
      point1.setX(20);
      point1.setY(10);
      point2.setX(19);
      point2.setY(57);
      
      /* Display the information in each object by 
         using the get methods. */
      System.out.printf("(%d, %d)%n", point1.getX(),
         point1.getY());
      System.out.printf("(%d, %d)%n", point2.getX(),
         point2.getY());

      /* Display the distance of each MyPoint object from the 
        point (9,16). */
      System.out.printf("The distance from the point (%d, %d) " +
         "to the point (%d, %d) is %.2f units.%n", point1.getX(),
         point1.getY(), 9, -16, point1.distance(9, -16));
      System.out.printf("The distance from the point (%d, %d) " +
         "to the point (%d, %d) is %.2f units.%n", point2.getX(),
         point2.getY(), 9, -16, point2.distance(9, -16));            
   }
}