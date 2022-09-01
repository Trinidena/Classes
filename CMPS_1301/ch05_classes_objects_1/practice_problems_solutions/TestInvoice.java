public class TestInvoice
{
   public static void main(String[] args)
   {
      Customer c1 = new Customer();
      c1.setId(1001);
      c1.setName("Alice");
      c1.setDiscount(10);
      
      Customer c2 = new Customer();
      c2.setId(1002);
      c2.setName("Bob");
      c2.setDiscount(5);
      
      Invoice inv1 = new Invoice();
      inv1.setNumber(1);
      inv1.setCustomer(c1);
      inv1.setAmount(20.0);
      
      Invoice inv2 = new Invoice();
      inv2.setNumber(2);
      inv2.setCustomer(c2);
      inv2.setAmount(100.0);
      
      System.out.printf("Invoice Number:  %d  Customer Number:  %d  Customer Name:  %s  " +
         "Discount:  %d%%  Amount:  $%.2f%n", inv1.getNumber(), inv1.getCustomer().getId(), 
         inv1.getCustomerName(), inv1.getCustomer().getDiscount(), inv1.getAmount());     
      
      System.out.printf("Amount after discount:  $%.2f%n", inv1.getAmountAfterDiscount());
      
      System.out.printf("Invoice Number:  %d  Customer Number:  %d  Customer Name:  %s  " +
         "Discount:  %d%%  Amount:  $%.2f%n", inv1.getNumber(), inv2.getCustomer().getId(), 
         inv2.getCustomerName(), inv2.getCustomer().getDiscount(), inv2.getAmount());
         
      System.out.printf("Amount after discount:  $%.2f%n", inv2.getAmountAfterDiscount());         
                     
   }
}