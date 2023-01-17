import java.util.ArrayList;

public class TestLadder
{
   public static void main(String[] args)
   {
      Ladder ladder1 = new Ladder("blue", 144);
      Ladder ladder2 = new Ladder("orange", 72);         
      FlexibleLadder ladder3 = new FlexibleLadder("red", 180, 3);
      FlexibleLadder ladder4 = new FlexibleLadder("yellow", 120, 5);
      
      ArrayList<Ladder> ladders = new ArrayList<Ladder>();
      
      ladders.add(ladder1); 
      ladders.add(ladder2);
      ladders.add(ladder3);
      ladders.add(ladder4);
      
      for(int i = 0; i < ladders.size(); i++)
      {
         System.out.println(ladders.get(i));
      } 
      
      System.out.println();
      
      /* Not required but here is further testing of set 
         methods for height and articulations.  
         Is the price updated correctly?*/
      ladder1.setHeight(150); //New price should be $225.
      ladder2.setHeight(65);  //New price should be $97.50
      ladder3.setHeight(110); //New price should be $401.50
      ladder4.setArticulations(22); //New price should be $541 
      
      for(int i = 0; i < ladders.size(); i++)
      {
         System.out.println(ladders.get(i));
      }                                     
   }
}