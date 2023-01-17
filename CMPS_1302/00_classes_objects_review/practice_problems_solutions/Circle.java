public class Circle
{
   private double radius;
   private String color;
   
   public Circle(double radius, String color)
   {
      this.radius = radius;
      this.color = color;
   }
   
   public Circle()
   {
      this(0.0, "black");
   }
   
   @Override
   public String toString()
   {
      return String.format("Radius:  %.2f  Color:  %s", radius, color);
   }
   
   public String getColor()
   {
      return color;
   }
   
   public void setColor(String color)
   {
      this.color = color;
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public void setRadius(double radius)
   {
      this.radius = radius;
   }  
}