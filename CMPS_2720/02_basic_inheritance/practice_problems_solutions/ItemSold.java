public class ItemSold
{
   private int invoiceNumber;
   private String description;
   private double price;
   
   public ItemSold(int invoiceNumber, String description, double price)
   {
      this.invoiceNumber = invoiceNumber;
      this.description = description;
      this.price = price;
   }
   
   @Override
   public String toString()
   {
      return String.format("Invoice: %d  Description: %s  Price: $%,.2f",
         invoiceNumber, description, price);  
   }
   
   public int getInvoiceNumber()
   {
      return invoiceNumber;
   }   
   
   public void setInvoiceNumber(int invoiceNumber)
   {
      this.invoiceNumber = invoiceNumber;
   }
   
   public String getDescription()
   {
      return description;
   }   
   
   public void setDescription(String description)
   {
      this.description = description;
   }

   public double getPrice()
   {
      return price;
   }   
   
   public void setPrice(double price)
   {
      this.price = price;
   }
   
}