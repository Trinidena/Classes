public abstract class Book
{
   private String title;
   private double price;
   
   public Book(String title)
   {
      this.title = title;
   }
   
   public abstract void setPrice(double price);
   
   public String getTitle()
   {
      return title;
   }
   
   public double getPrice()
   {
      return price;
   }
}