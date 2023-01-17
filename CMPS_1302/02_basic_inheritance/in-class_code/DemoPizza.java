public class DemoPizza
{
   public static void main(String[] args)
   {
      Pizza p0 = new Pizza("cheese", 7.5);
      Pizza p1 = new Pizza("pepperoni", 8.45);
      DeliveryPizza p2 = new DeliveryPizza("supreme", 17.34, "34 Whatever St.");
      DeliveryPizza p3 = new DeliveryPizza("sausage", 10.43, "77 Euclid Ave.");
      
      Pizza[] pizzas = {p0, p1, p2, p3};
      
      for(Pizza pizza : pizzas)
      {
         System.out.println(pizza);
      }
   }
}