import java.util.ArrayList;

public class ArrayList
{
   public static void main(String[] args)
   {
      ArrayList<Integer> list1 = new ArrayList<>(5);
      ArrayList<Integer> list2 = new ArrayList<>(5);
      
      list1.add(1);
      list1.add(2);
      list1.add(3);
      list1.add(4);
      list1.add(5);
      list2.add(6);
      list2.add(7);
      list2.add(8);
      list2.add(9);
      list2.add(0);
      
      averageFirstLast(list1);
      averageFirstLast(list2);
   }
   
   public static int averageFirstLast(ArrayList<Integer> a)
   {
      return a.get(0) + a.get(a.size() -1) / 2;
   }
}