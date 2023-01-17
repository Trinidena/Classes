public class Book extends Good implements Taxable
{
   private String author;

   public Book(String idNumber, double price, String author)
   {
      super(idNumber,price);
      this.author = author;
   }
      
   public double calculateTax()
   {
      return 0.06 * price;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Author:  %s", super.toString(), author);
   }


   public String description()
   {
      return String.format("This is a book written by %s.", author);
   }
   
   public String getAuthor()
   {
      return author;
   }
   
   public void setAuthor(String author)
   {
      this.author = author;
   }
}