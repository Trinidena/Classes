public class Sorting2
{
   public static void main(String[] args)
   {
      String[] letters = {"m" , "g" , "z" , "t" , "a" , "k" , "e"};
      selectionSort(letters);
   }
   
   public static <T extends Comparable> void selectionSort(T[] arr)
   {
      for(int i = 0; i < arr.length - 1; i++)
      {
         int bigIndex = 0;
         for(int j = 1; j < arr.length - i; j++)
         {
            if(arr[j].compareTo(arr[bigIndex]) > 0)
            {
               bigIndex = j;
            }
         }
         swap(arr , bigIndex , arr.length - i - 1);
      }
   }
   
   public static <T> void swap(T[] arr , int i , int j)
   {
      T temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
}
