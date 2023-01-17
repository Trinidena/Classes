public abstract class Shape
{
   protected double height;
   protected double width;
   
   public Shape(double height, double width)
   {
      this.height = height;
      this.width = width;
   }
   
   public abstract double calculateArea();
   
   @Override
   public String toString()
   {
      return String.format("Height:  %.2f  Width:  %.2f", height, width);
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWidth()
   {
      return width;
   } 
   
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   public void setWidth(double width)
   {
      this.width = width;
   }
}