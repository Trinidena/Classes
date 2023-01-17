public class ThrowProductException
{
   public static void main(String[] args)
   {
      try
      {
         Product p1 = new Product(123, 6.65);
         System.out.println("Object p1 successfully created.");
         Product p2 = new Product(932, 8.43);
         System.out.println("Object p2 successfully created.");         
         Product p3 = new Product(882, 7.45);
         System.out.println("Object p3 successfully created.");         
         Product p4 = new Product(342, 19.99);
         System.out.println("Object p4 successfully created.");
         Product p5 = new Product(1, 6.72);
         System.out.println("Object p5 successfully created.");      
      }
      catch(ProductException e)
      {
         System.out.printf("Error:  invalid input values %s%n", e.getMessage());
      }
      
      try
      {
         Product p6 = new Product(491, 62342.72);
         System.out.println("Object p6 successfully created.");        
      }
      catch(ProductException e)
      {
         System.out.printf("Error:  invalid input values %s%n", e.getMessage());
      }         
   }
}