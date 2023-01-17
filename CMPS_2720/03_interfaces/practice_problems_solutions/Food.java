public class Food extends Good implements Taxable
{
   private int calories;
   
   public Food(String idNumber, double price, int calories)
   {
      super(idNumber, price);
      this.calories = calories;
   } 
   
   public double calculateTax()
   {
      return 0.0;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Calories:  %d", super.toString(), calories);
   }
   
   public String description()
   {
      return String.format("This is a food item with %d calories.", calories);
   }
   
   public int getCalories()
   {
      return calories;
   }
   
   public void setCalories(int calories)
   {
      this.calories = calories;
   }
}