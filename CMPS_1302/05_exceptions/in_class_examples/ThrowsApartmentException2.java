public class ThrowsApartmentException2 {
   public static void main(String[] args){
      // Three proper Apartments, and three improper Apartments
      // The three incorrect Apartments will throw an exception
      Apartment[] apartments = new Apartment[6];
      apartments[0] = makeApartment("Testing st.",123,2,650);
      apartments[1] = makeApartment("Still Works rd.",500,3,1000);
      apartments[2] = makeApartment("Another ave.",111,1,1200);
      apartments[3] = makeApartment("Invalid apartment # ct.",-5,2,1000);
      apartments[4] = makeApartment("Invalid rooms ln.",999,100,1000);
      apartments[5] = makeApartment("Invalid rent cir.",555,2,-9001);
      
      for(Apartment a : apartments)
         System.out.println(a);
   }
   
   private static Apartment makeApartment
      (String addr, int apart, int rooms, int rent)
   {
      // Separate method for instantiating Apartments
      // so that every exception will be printed
      // instead of stopping at the first invalid instance
      Apartment output = null;
      try {
         output = new Apartment(addr,apart,rooms,rent);
         // If Apartment constructor throws an exception, the following lines will not be called
         System.out.println("Successful Apartment created: " + output);
      } catch(ApartmentException e){
         System.err.println(e);
      } finally {
         // This will always be called, even with an exception
         return output;
      }
   }
}