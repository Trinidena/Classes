import java.util.ArrayList;

public class OneThousandMyPointObjects
{
   public static void main(String[] args)
   {
      ArrayList<MyPoint> points = new ArrayList<MyPoint>();
      
      for(int i = 0; i < 1000; i++)
      {
         points.add(new MyPoint(i, i + 1));
      }
      
      for(int i = 0; i < points.size(); i++)
      {
         System.out.println(points.get(i));
      }      
   }
}