public class ThrowApartmentException
{
   public static void main(String[] args)
   {
      String[] addresses = {"1 A St.", "2 B St.", "3 C St.", "4 d St.", "5 E St.", "6 F St."};
      int[] aptNumbers = {1, 100, 200, 300, 400, 5003};
      int[] bedroomNumbers = {0, 1, 2, 3, 4, 5};
      double[] rents = {0.0, 500.0, 600.0, 700.0, 800.0, 234232.0}; 
      Apartment[] apartments = new Apartment[addresses.length];
      
      for(int i = 0; i < addresses.length; i++)
      {
         try
         {
            apartments[i] = new Apartment(addresses[i], aptNumbers[i], bedroomNumbers[i], rents[i]);
            System.out.println("Apartment object creation successful.");
         }
         catch(ApartmentException e)
         {
            System.out.println(e.getMessage());
            apartments[i] = new Apartment("error", 100, 1, 500.0);
         }
      }
      
      for(Apartment apartment : apartments)
      {
         System.out.println(apartment);
      }      
   }
}