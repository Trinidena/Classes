public class Toy extends Good implements Taxable
{
   private int minimumAge;

   public Toy(String idNumber, double price, int minimumAge)
   {
      super(idNumber,price);
      this.minimumAge = minimumAge;
   }
      
   public double calculateTax()
   {
      return 0.06 * price;
   }

   @Override
   public String toString()
   {
      return String.format("%s Minimum Age:  %d", super.toString(), minimumAge);
   }
   
   public String description()
   {
      return String.format("This is a toy for ages %d and up.", minimumAge);
   }
   
   public int getMinimumAge()
   {
      return minimumAge;
   }
   
   public void setMinimumAge(int minimumAge)
   {
      this.minimumAge = minimumAge;
   }
}