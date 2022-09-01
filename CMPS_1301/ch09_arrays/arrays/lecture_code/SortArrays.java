import java.util.Arrays;

public class SortArrays
{
   public static void main(String[] args)
   {
      int[] numbers = {34, -17, 5, 1, 0, 77, 343, 21};
      String[] words = {"charlie", "alpha", "echo", "bravo", "delta"};
      
      System.out.println(Arrays.toString(numbers));
      Arrays.sort(numbers);
      System.out.println(Arrays.toString(numbers));
      
      System.out.println(Arrays.toString(words));
      Arrays.sort(words);
      System.out.println(Arrays.toString(words));       
   }
}