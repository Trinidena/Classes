public class TestCustomer
{
   public static void main(String[] args)
   {
      Customer c1 = new Customer();
      c1.setId(1);
      c1.setName("Djamolodine Abdujabarov");
      c1.setDiscount(59);
      System.out.printf("id:  %d  name:  %s  discount:  %d%s%n", c1.getId(), c1.getName(),
         c1.getDiscount(), "%");
      
      Customer c2 = new Customer();
      c2.setId(2);
      c2.setName("Davis Finney");
      c2.setDiscount(32);
      System.out.printf("id:  %d  name:  %s  discount:  %d%s%n", c2.getId(), c2.getName(),
         c2.getDiscount(), "%");             
   }
}