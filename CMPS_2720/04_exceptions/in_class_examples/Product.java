public class Product
{
   String productNumber;
   double price;
   
   public Product(String productNumber, double price) throws ProductException
   {
      this.productNumber = productNumber;
      this.price = price;
      
      if(productNumber.length() != 3 || !Character.isDigit(productNumber.charAt(0))
            || !Character.isDigit(productNumber.charAt(1))
            || !Character.isDigit(productNumber.charAt(2))
            || price < 0.01
            || price > 1000.0)
      {      
         throw new ProductException(productNumber + " " + price); 
      }        
   }
}