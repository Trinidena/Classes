public class PrintedFigures
{
   public static void main(String[] args)
   {
      printShapeOne();
      printShapeTwo();
      printShapeThree();
   }
   
   public static void printShapeOne()
   {
      printDoubleBar();
      System.out.println();
      printX();
   }
   
   public static void printShapeTwo()
   {
      System.out.println();   
      printShapeOne();
      printDoubleBar();
   }
   
   public static void printShapeThree()
   {
      System.out.println("\n");
      printLine();
      printShapeOne();
   }
   
   public static void printDoubleBar()
   {
      System.out.print("*****\n*****");
   } 
   
   public static void printX()
   {
      System.out.print(" * *\n  *\n * * \n");
   }
   
   public static void printLine()
   {
      System.out.println("  *\n  *\n  *");
   }
}