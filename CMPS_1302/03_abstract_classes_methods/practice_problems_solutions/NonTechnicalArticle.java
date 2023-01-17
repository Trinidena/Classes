public class NonTechnicalArticle extends Article
{
   public NonTechnicalArticle(String title)
   {
      super(title);
      setPrice();
   }
   
   public void setPrice()
   {
      this.price = 37.99;
   }
}