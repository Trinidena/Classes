public class TestCircle
{
   public static void main(String[] args)
   {
      Circle c1 = new Circle();
      c1.setRadius(19.57);
      c1.setColor("burnt orange");
      System.out.printf("radius:  %.2f  color:  %s%n", c1.getRadius(), c1.getColor());
      
      Circle c2 = new Circle();
      c2.setRadius(20.10);
      c2.setColor("navy blue");
      System.out.printf("radius:  %.2f  color:  %s%n", c2.getRadius(), c2.getColor());             
   }
}