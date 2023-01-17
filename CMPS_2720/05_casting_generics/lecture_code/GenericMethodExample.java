public class GenericMethodExample
{
   public static void main(String[] args)
   {
      String[] words = {"a", "b", null, "b", "b", "b", "a", "c"};
      Integer[] numbers = {0, 0, 0, 2, 3, 4, 2, -1, 0};
      
      System.out.println(countOccurrences(words, "a"));
      System.out.println(countOccurrences(numbers, 0));      
   }
   
   public static <T> int countOccurrences(T[] list, T itemToCount)
   {
      int count = 0;
      
      for(T item : list)
      {
         if(item != null && item.equals(itemToCount))
         {
            count++;
         }
      }
      
      return count;
   }
}