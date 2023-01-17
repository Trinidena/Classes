import java.util.Arrays;

public class ElementArray
{
   public static void main(String[] args)
   {
      Element[] elementArray = new Element[4];
      elementArray[0] = new MetalElement("Fe", 26, 55.845);
      elementArray[1] = new MetalElement("Pb", 82, 207.2);
      elementArray[2] = new NonMetalElement("Xe", 54, 131.293);
      elementArray[3] = new NonMetalElement("He", 2, 4.0026); 
      
      for(Element element : elementArray)
      {
         System.out.println(element.describeElement());
      }     
   }
}