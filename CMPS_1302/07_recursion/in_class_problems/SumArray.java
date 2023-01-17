public class SumArray
{
   public static void main(String[] args)
   {
      int[] numbers = {4, 9, 2, 0, -2, 6};
      
      System.out.println( sumArray(numbers, 0) );
   }
   
   public static int sumArray(int[] arr, int index)
   {
      if(index == arr.length - 1)
      {
         return arr[arr.length - 1];
      }
      else
      {
         return arr[index] + sumArray(arr, index + 1);
      }
   }
}