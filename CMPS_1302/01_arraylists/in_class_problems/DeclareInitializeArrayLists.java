import java.util.ArrayList;

public class DeclareInitializeArrayLists
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
      words.add("alpha");
      words.add("bravo");
      words.add("charlie");
      words.add("delta");
      System.out.println(words);
      
      ArrayList<Double> nums = new ArrayList<Double>();
      nums.add(2.3);
      nums.add(9.01);
      nums.add(7.34);
      System.out.println(nums);
      
      ArrayList<Integer> ints = new ArrayList<Integer>();
      for(int i = 0; i < 8000; i++)
      {
         ints.add(32);
      }
      System.out.println(ints);
      
      MyPoint p1 = new MyPoint(0, 2);
      MyPoint p2 = new MyPoint(9, 10);
      MyPoint p3 = new MyPoint(7, 3);
      
      ArrayList<MyPoint> points = new ArrayList<MyPoint>();
      points.add(p1);
      points.add(p2);
      points.add(p3);
      System.out.println(points);
   }
}