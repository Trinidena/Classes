public class AnotherChildClass extends AParentClass
{
   public AnotherChildClass()
   {
      /* The parent has no constructor that has no parameters, so
         we must call one of the constructors with parameters 
         in the first line of the child's constructor. */  
      
      /* Calling the two paraemter constructor in the parent, so
         must supply two arguments */
             
      super(5, 9);   
         
      System.out.println("In the another child constructor.");
   }
   
   @Override
   public String toString()
   {
      return String.format("In the AnotherChildClass object the value of the field aNumber is %d.",
         aNumber);
   }
}