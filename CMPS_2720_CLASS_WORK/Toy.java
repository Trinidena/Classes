public class Toy extends Good implements Taxable {
   private int minimumAge;

   public Toy(String idNumber, double price, int minimumAge) {
      super(idNumber, price);
      this.minimumAge = minimumAge;
   }

   public String description() {
      return String.format("This is a toy for %d and up.", minimumAge);
   }

   @Override
   public String toString() {
      return String.format("%s , Minimum Age: %d", super.toString(), minimumAge);
   }

   public int getMinimumAge() {
      return minimumAge;
   }

   public void setMinimumAge() {
      this.minimumAge = minimumAge;
   }

   public double calculateTax() {
      return (price * taxRate);
   }
}