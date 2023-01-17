public class Triangle extends Shape implements Polygon
{
   public Triangle(double height, double width)
   {
      super(height, width);
   }
   
   public double calculateArea()
   {
      return width * height / 2.0;
   }
   
   public int numberSides()
   {
      return 3;
   }
}