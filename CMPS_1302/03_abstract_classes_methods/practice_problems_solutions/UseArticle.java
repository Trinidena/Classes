public class UseArticle
{
   public static void main(String[] args)
   {
      TechnicalArticle article1 = new TechnicalArticle("Extrapolations in Structural Non-Euclidean Geometry");
      NonTechnicalArticle article2 = new NonTechnicalArticle("Improve your Golf Swing in Five Easy Steps");
      
      System.out.printf("Title: %s  Price:  $%.2f%n", article1.getTitle(), article1.getPrice());
      System.out.printf("Title: %s  Price:  $%.2f%n", article2.getTitle(), article2.getPrice());      
   }
}