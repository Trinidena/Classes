public class TestMyPoint
{
   public static void main(String[] args)
   {
      MyPoint point1 = new MyPoint();
      MyPoint point2 = new MyPoint(9,3);
     MyPoint[] points = {point1, point2};
     for(int i = 0; i < points.length; i++)
     {
        System.out.println(points[i]);
     }
   }
}