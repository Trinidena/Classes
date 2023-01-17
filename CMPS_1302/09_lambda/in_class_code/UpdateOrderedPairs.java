import java.util.ArrayList;
import java.util.List;

public class UpdateOrderedPairs
{
   public static void main(String[] args)
   {
      ArrayList<OrderedPair> pairs = new ArrayList<OrderedPair>();
      pairs.add(new OrderedPair(1));
      pairs.add(new OrderedPair(2));
      pairs.add(new OrderedPair(3));
      pairs.add(new OrderedPair(4));      
      pairs.add(new OrderedPair(5));
            
      System.out.println(pairs);
      pairs.forEach(OrderedPair::updateY);
      System.out.println(pairs);             
   }    
}