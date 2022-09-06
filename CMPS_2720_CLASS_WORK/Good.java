public abstract class Good 
{
   protected String idNumber;
   protected double price;
   
   public Good(String idNumber , double price)
   {
      this.idNumber = idNumber;
      this.price = price;
   }
   
   public abstract String description();
   
   @Override
   public String toString()
   {
      return String.format("ID: %s , Price: %,.2f" , idNumber , price);
   }
   
   public String getIDNumber()
   {
      return idNumber;
   }
   
   public double getPrice()
   {
      return price;
   }
   public void setIDNumber(String idNumber)
   {
      this.idNumber = idNumber;
   }
}