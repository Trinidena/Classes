import java.util.Arrays;

public class DeclarePrintArrays
{
   public static void main(String[] args)
   {
      String[] words = {"alpha", "bravo", "charlie", "delta"};
      double[] numbers = new double[3];
      int[] nums = new int[8000];
      for(int i = 0; i < nums.length; i++)
      {
         nums[i] = 32;
      }
      
      // Create empty array of length 50.
      MyPoint[] points = new MyPoint[50];
      
      // Use a for loop to create and store fifty MyPoint objects.
      for(int i = 0; i < points.length; i++)
      {
         // Create a MyPoint object and stored it in the array.
         points[i] = new MyPoint(2 * i, 3 - 5 * i);
      }
            
      System.out.println(words);
      for(int i = 0; i < words.length; i++)
      {
         System.out.printf("%s ", words[i]);
      }
      
      System.out.println();
      System.out.println(Arrays.toString(words));
      
      System.out.println(points); 
      
      for(int i = 0; i < points.length; i++)
      {
         System.out.println(points[i]);
      }
      System.out.println(Arrays.toString(points));              
   }
}