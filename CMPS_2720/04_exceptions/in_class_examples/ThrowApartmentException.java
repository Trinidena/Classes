public class ThrowApartmentException
{
   public static void main(String[] args)
   {
      try
      {
         Apartment a1 = new Apartment("a", 10, 1, 750.0);
      }
      catch(ApartmentException e)
      {
         System.out.println(e.getMessage());
      }   
   }
}