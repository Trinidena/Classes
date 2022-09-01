public class ItemSold
{
   protected int invoice;
   protected String description;
   protected double price;
   
   public ItemSold(int invoice , String description , double price)
   {
      this.invoice = invoice;
      this.description = description;
      this.price = price;
   }
   @Override
   public String toString()
   {
      return String.format("Invoice: %d , Description: %s , Price: %f",
         invoice , description , price);
   }
   
}