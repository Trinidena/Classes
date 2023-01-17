public class AParentClass
{
   protected int aNumber;
    
   public AParentClass(int aNumber)
   {
      this.aNumber = aNumber;
      System.out.println("In the parent's one parameter constructor.");
   }
   
   // Another constructor just for example purposes
   public AParentClass(int numberOne, int numberTwo)
   {
      this.aNumber = numberOne - numberTwo;
      System.out.println("In the parent's two parameter constructor.");
   }
}