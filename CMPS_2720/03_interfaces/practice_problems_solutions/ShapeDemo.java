public class ShapeDemo
{
   public static void main(String[] args)
   {
     /* Array type must be Shape or Polygon in order to store both Triangle
        and Rectangle objects. */
      Shape[] shapes = { new Square(3.2, 5.6),
         new Triangle(9.2, 0.78),
         new Square(0.3, 6.89),
         new Triangle(123.8, 99.2)};
      
      for(Shape shape : shapes)
      {
         System.out.println(shape);
         System.out.printf("The area is %,.2f square units.%n", shape.calculateArea());
         
         /* Since the array is of type Shape, shape.displaySides(); will 
            not work so recast object to the interface type, Polygon */
         System.out.printf("Number of sides:  %d%n", ((Polygon)shape).numberSides());
      }   
   }
}