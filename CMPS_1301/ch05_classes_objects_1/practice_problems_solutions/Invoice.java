public class Invoice
{
   private int number;
   private Customer customer;
   private double amount;
 
   public String getCustomerName()
   {
      return customer.getName();
   }
   
   public double getAmountAfterDiscount()
   {
      return (1 - customer.getDiscount() / 100.0) * amount;
   }
      
   public int getNumber()
   {
      return number;
   }
   
   public void setNumber(int number)
   {
      this.number = number;
   }
   
   public Customer getCustomer()
   {
      return customer;
   }
   
   public void setCustomer(Customer customer)
   {
      this.customer = customer;
   }
   
   public double getAmount()
   {
      return amount;
   }
   
   public void setAmount(double amount)
   {
      this.amount = amount;
   }
}