public class AverageFirstLast
{
   public static void main(String[] args)
   {
      int[] a1 = {2, 3, 8, 2, 1, 0};
      int[] a2 = {5, 23, 232, 43, 232, 23, 8};
      System.out.println(averageFirstLast(a1));
      System.out.println(averageFirstLast(a2));
   }
   
   public static int averageFirstLast(int[] a)
   {
      int average = (a[0] + a[a.length - 1]) / 2;
      return average;
   }
}