public class TestPizza
{
   public static void main(String[] args)
   {
      Pizza pizza1 = new Pizza("Pepperoni" , 10);
      Pizza pizza2 = new Pizza("Cheese" , 8);
      DeliveryPizza pizza3 = new DeliveryPizza("Sausage" , 10 , "2 Whatever St.");
      DeliveryPizza pizza4 = new DeliveryPizza("Supreme" , 20 , "650 College Drive");
      
      Pizza[] pizzas = {pizza1 , pizza2 , pizza3 , pizza4};
      
      for(int i = 0; i < pizzas.length; i++)
      {
         System.out.println(pizzas[i]);
      }
   }
}