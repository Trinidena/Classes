public class Book extends Good implements Taxable
{
   private String author;
   
   public Book(String idNumber , double price , String author)
   {
     super(idNumber , price);
     this.author = author;
   }
   
   public String description()
   {
      return String.format("This is a book by %s." , author);
   }
   @Override
   public String toString()
   {
      return String.format("%s , Author: %s" , super.toString() , author);
   }
   
   public String getAuthor()
   {
      return author;
   }
   
   public void setAuthor()
   {
      this.author = author;
   }
   
   public double calculateTax()
   {
      return price * taxRate;
   }
}