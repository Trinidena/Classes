public class ArticleArray
{
   public static void main(String[] args)
   {
      Article[] articleArray = new Article[10];
      
      articleArray[0] = new TechnicalArticle("Article A");
      articleArray[1] = new NonTechnicalArticle("Article B");
      articleArray[2] = new TechnicalArticle("Article C");
      articleArray[3] = new NonTechnicalArticle("Article D");
      articleArray[4] = new TechnicalArticle("Article E");
      articleArray[5] = new NonTechnicalArticle("Article F");
      articleArray[6] = new TechnicalArticle("Article G");
      articleArray[7] = new NonTechnicalArticle("Article H");
      articleArray[8] = new TechnicalArticle("Article I");
      articleArray[9] = new NonTechnicalArticle("Article J");
      
      for(Article article : articleArray)
      {
         System.out.printf("Title: %s  Price:  $%.2f%n", article.getTitle(), article.getPrice());
      }
                                    
   }
}