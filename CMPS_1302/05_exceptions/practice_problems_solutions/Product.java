public class Product
{
   private int productNum;
   private double price;
      
   public Product(int productNum, double price) throws ProductException
   {
      if(productNum < 100 || productNum > 999 || price < 0.01 || price > 1000.0)
      {
         throw new ProductException(String.format("%d %f", productNum, price));
      }
   }
}