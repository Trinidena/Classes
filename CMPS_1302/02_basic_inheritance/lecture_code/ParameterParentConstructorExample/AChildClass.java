public class AChildClass extends AParentClass
{
   public AChildClass()
   {
      /* The parent has no constructor that has no parameters, so
         we must call one of the constructors with parameters 
         in the first line of the child's constructor. */  
      
      /* Calling the one paraemter constructor in the parent, so
         must supply one argument */
             
      super(3);   
         
      System.out.println("In the child constructor.");
   }
   
   @Override
   public String toString()
   {
      return String.format("In the AChildClass object the value of the field aNumber is %d.",
         aNumber);
   }
}