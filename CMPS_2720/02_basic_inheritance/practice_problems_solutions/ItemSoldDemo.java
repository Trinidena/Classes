public class ItemSoldDemo
{
   public static void main(String[] args)
   {
      ItemSold item1 = new ItemSold(1, "A statuette of a maltese falcon.", 1000000.0);
      ItemSold item2 = new ItemSold(2, "A used shoe.", 0.52);               
      CarSold car1 = new CarSold(3, "A lime green 1985 Plymouth Reliant K.",
                                 250.0, true, false, false);
      CarSold car2 = new CarSold(4, "A red 2019 Maserati GranTurismo.",
                                 134300.0, true, true, true);
      
      ItemSold[] items = {item1, item2, car1, car2};
      
      // Enhanced for loop
      for(ItemSold item : items)
      {
         System.out.println(item);
      }         
      
   }
}