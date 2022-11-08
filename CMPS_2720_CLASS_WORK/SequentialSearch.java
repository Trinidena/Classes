public class SequentialSearch<E>
{
   public static void main(String[] args)
   {
      String[] orderedLetters = {"a" , "b" , "c" , "d", "e" , "r" , "x" , "z"};
      String[] letters = {"b" , "c" , "a" , "g", "h" , "z" , "x" , "r"};
      System.out.println(sequentialSearch(letters , "a"));
      System.out.println(sequentialSearch(letters , "z"));
      System.out.println(sequentialSearch(letters , "b"));
      System.out.println(sequentialSearch(letters , "r"));
      System.out.println(sequentialSearch(letters , "q"));
      
      System.out.println(binarySearch(orderedLetters , "a"));
      System.out.println(binarySearch(orderedLetters , "z"));
      System.out.println(binarySearch(orderedLetters , "b"));
      System.out.println(binarySearch(orderedLetters , "r"));
      System.out.println(binarySearch(orderedLetters , "q"));
      
   }
   
   public static <E extends Comparable> int binarySearch(E[] arr , E element)
   {
      int first = 0;
      int last = arr.length - 1;
      int mid = -1;
      
      boolean found = false;
      
      while(first <= last && !found)
      {
         mid = (first + last) / 2;
         
         if(arr[mid].equals(element))
         {
            found = true;
         }
         else if(arr[mid].compareTo(element) > 0)
         {
            last = mid - 1;
         }
         else
         {
            first = mid + 1;
         }
      }
         
      if(found)
      {
         return mid;
      }
      else
      {
         return -1;

      }
   }
   
   public static <E> int sequentialSearch(E[] arr, E element)
   {
      for(int i = 0; i < arr.length; i++)
      {
         if(arr[i].equals(element))
         {
            return i;
         }
      }
      return -1;
   }
}