public abstract class Animal
{
   protected String species;
   
   public abstract String speak();
   
   public String toString()
   {
      return String.format("I am a %s and I go %s.", species, speak());
   }      
}   