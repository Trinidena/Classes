public class ItemsSold {
   public static void main(String[] args) {
      ItemSold item1 = new ItemSold(1, "Gilded lava lamp", 15250);
      ItemSold item2 = new ItemSold(2, "Plastic spoon", 2398);
      CarSold car1 = new CarSold(3, "Ford", 12345, true, true, false);
      CarSold car2 = new CarSold(4, "Nissan", 54321, true, false, false);

      ItemSold[] items = { item1, item2, car1, car2 };

      for (ItemSold item : items) {
         System.out.println(item);
      }
   }
}