public class Sorting
{
   public static void main(String[] args)
   {
      String[] words = {"r" , "g" , "a" , "z" , "x" , "c" , "m" , "j"};
      //bubblesort(words);
      String[] words1 = {"r" , "g" , "a" , "z" , "x" , "c" , "m" , "j"};
      insertionSort(words);
   }
   
   public static <T extends Comparable> void insertionSort(T[] arr)
   {
      for(int i = 0; i < arr.length - 1; i++)
      {
         for(int j = i; (j > 0) && (arr[j].compareTo(arr[j-1]) < 0); j--)
         {
            swap(arr , j , j-1);
         }
      }
   }
   public static <T extends Comparable> void bubblesort(T[] arr)
   {
      for(int i = 0; i < arr.length - 1; i++)
      {
         for(int j = i; j < arr.length - i; j++)
         {
            if(arr[j-1].compareTo(arr[j]) > 0)
            {
               swap(arr , j-1 , j);
            }
         }
      }
   }
   
   public static <T> void swap(T[] array , int i , int j)
   {
      T temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }
}