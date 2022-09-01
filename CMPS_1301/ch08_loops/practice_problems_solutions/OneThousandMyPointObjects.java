public class OneThousandMyPointObjects
{
   public static void main(String[] args)
   {
      for(int i = 0; i < 1000; i++)
      {
         MyPoint point = new MyPoint(i + 1, 2 * i - 7);
         System.out.println(point);
      }
   }
}