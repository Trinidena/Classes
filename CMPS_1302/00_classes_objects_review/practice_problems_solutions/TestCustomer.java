public class TestCustomer
{
   public static void main(String[] args)
   {
      Customer customer1 = new Customer(152, "Brooks Koepke");
      Customer customer2 = new Customer(25, 3452, "Rickey Fowler");
      Customer[] customers = {customer1, customer2};
      for(int i = 0; i < customers.length; i++)
      {
         System.out.println(customers[i]);
      } 
   }
}