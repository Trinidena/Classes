public class ThrowProductException
{
   public static void main(String[] args)
   {
      String[] pNums = {"892", "12a", "23", "342", "324", "902"};
      double[] prices = {6.78, 5.23, 67.32, -0.05, 2131232.54, 56.22};
      
      Product aProduct = null;
      
      for(int i = 0; i < pNums.length; i++)
      {
         try
         {
            aProduct = new Product(pNums[i], prices[i]);
            System.out.printf("Product object with product number %s and price " +
               "$%,.2f successfully created.%n", pNums[i], prices[i]);
         }
         catch(ProductException e)
         {
            System.out.printf("Attempted creation of product object with product number " + 
               "%s and price $%,.2f caused exception.%n", pNums[i], prices[i]);
         }      
      }
   }
}