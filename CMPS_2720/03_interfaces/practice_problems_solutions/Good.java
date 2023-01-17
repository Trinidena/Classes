public abstract class Good
{
   protected String idNumber;
   protected double price;
  
   public Good(String idNumber, double price)
   {
      this.idNumber = idNumber;
      this.price = price;
   }
   
   @Override
   public String toString()
   {
      return String.format("ID: %s  Price: %,.2f", idNumber, price);
   }
   
   public abstract String description();
   
   public String getId()
   {
      return idNumber;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public void setIdNumber(String idNumber)
   {
      this.idNumber = idNumber;
   }
   
   public void setPrice(double price)
   {
      this.price = price;
   }
}