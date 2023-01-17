public class Square extends Shape implements Polygon
{
   public Square(double height, double width)
   {
      super(height, width);
   }
   
   public double calculateArea()
   {
      return width * height;
   }
   
   public int numberSides()
   {
      return 4;
   }  
}