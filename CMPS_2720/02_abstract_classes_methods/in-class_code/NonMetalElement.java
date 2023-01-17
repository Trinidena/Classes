public class NonMetalElement extends Element
{
   public NonMetalElement(String symbol, int atomicNumber, double atomicWeight)
   {
      super(symbol, atomicNumber, atomicWeight);
   }
   
   public String describeElement()
   {
      return String.format("%s has atomic number %d and atomic weight %f.  It is a " + 
         "poor conductor of electricity.", symbol, atomicNumber, atomicWeight);
   }
}