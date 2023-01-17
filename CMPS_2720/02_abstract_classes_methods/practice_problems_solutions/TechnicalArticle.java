public class TechnicalArticle extends Article
{
   public TechnicalArticle(String title)
   {
      super(title);
      setPrice();
   }
   
   public void setPrice()
   {
      this.price = 24.99;
   }
}