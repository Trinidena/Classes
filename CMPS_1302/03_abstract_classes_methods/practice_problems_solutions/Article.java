public abstract class Article
{
   protected String title;
   protected double price;
   
   public Article(String title)
   {
      this.title = title;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public abstract void setPrice();
}