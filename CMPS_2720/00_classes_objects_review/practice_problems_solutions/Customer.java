public class Customer
{
   private int discount;
   private int id;
   private String name;
   
   public Customer(int discount, int id, String name)
   {
      this.discount = discount;
      this.id = id;
      this.name = name;
   }
   
   public Customer(int id, String name)
   {
      this(0, id, name);
   }
   
   @Override
   public String toString()
   {
      return String.format("ID:  %d   Name:  %s  Discount:  %d%s", id, name, discount, "%");
   }
   
   public int getDiscount()
   {
      return discount;
   }
   
   public void setDiscount(int discount)
   {
      this.discount = discount;
   }
 
   public int getId()
   {
      return id;
   }
   
   public void setId(int id)
   {
      this.id = id;
   }

   public String getName()
   {
      return name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }   
}