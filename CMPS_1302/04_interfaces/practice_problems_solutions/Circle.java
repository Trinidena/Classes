public class Circle extends Asset implements Measurable
{
   private double radius;
   
   public Circle(String idNumber, double radius)
   {
      super(idNumber);
      this.radius = radius;
   }

   @Override
   public String toString()
   {
      return String.format("%s  Radius: %,.2f", super.toString(), radius);
   }
 
   public String description()
   {
      return "It's round.";
   }
   
   public double getMeasure()
   {
      return pi * Math.pow(radius, 2.0);
   }
}