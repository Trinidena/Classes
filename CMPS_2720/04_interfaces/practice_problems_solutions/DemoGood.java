public class DemoGood
{
   public static void main(String[] args)
   {
      Good[] goods = {new Food("123lsd", 8.98, 452), new Food("5df3lsd", 18.98, 145),
         new Toy("33r9sd92", 15.87, 6), new Toy("23dfs452d", 45.87, 7),
         new Book("938dske2", 10.99, "Charles Bukowski"),
         new Book("14sd211", 14.99, "Chuck Palahniuk")}; 
         
      for(Good good : goods)
      {
         System.out.println(good);
         System.out.println(good.description());
         System.out.printf("The tax is $%,.2f.%n%n", ((Taxable)good).calculateTax());
      }   
   }
}