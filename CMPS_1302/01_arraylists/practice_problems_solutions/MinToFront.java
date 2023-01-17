import java.util.ArrayList;

public class MinToFront
{
   public static void main(String[] args)
   {
      ArrayList<Integer> nums = new ArrayList<Integer>();
      
      nums.add(3);
      nums.add(8);
      nums.add(92);
      nums.add(4);
      nums.add(2);
      nums.add(17);
      nums.add(9);
      
      System.out.println(nums);
      System.out.println(minToFront(nums));                        
   }
   
   public static ArrayList<Integer> minToFront(ArrayList<Integer> in)
   {
      ArrayList<Integer> out = new ArrayList<Integer>();
      int min = in.get(0);
      int index = 0;
      
      for(int i = 0; i < in.size(); i++)
      {
         int number = in.get(i);
         out.add(number);
         if(number < min)
         {
            min = number;
            index = i;
         }
      }
      
      out.remove(index);
      out.add(0,min);
      
      return out;
   }   
}