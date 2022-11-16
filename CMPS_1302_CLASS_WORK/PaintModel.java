import java.util.ArrayList;
import java.io.Serializable;

public class PaintModel implements Serializable
{
   private String color;
   private ArrayList<Rectangle> rectangles;
   
   public PaintModel(String color)
   {
      this.color = color;
      rectangles = new ArrayList<>();
      System.out.println(color);
   }
   
   public void add(Rectangle r)
   {
      rectangles.add(r);
   }
   
   public String getColor()
   {
      return color;
   }
   
   public void setColor(String color)
   {
      this.color = color;
      System.out.println(color);
   }
   
   public void clearRectangles()
   {
      rectangles = new ArrayList<>();
   }
}