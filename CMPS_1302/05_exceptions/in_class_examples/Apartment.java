public class Apartment
{
   private String address;
   private int aptNumber;
   private int numberBedrooms;
   private double rent;
   
   public Apartment(String address, int aptNumber, int numberBedrooms, double rent) throws ApartmentException
   {
      this.address = address;
      this.aptNumber = aptNumber;
      this.numberBedrooms = numberBedrooms;
      this.rent = rent;
      
      if(aptNumber < 100 || 
         aptNumber > 1000 ||
         numberBedrooms < 1 ||
         numberBedrooms > 4 ||
         rent < 500 ||
         rent > 2500)
      {
         throw new ApartmentException(String.format("%s %d %d %f", address, aptNumber,
            numberBedrooms, rent));
      }         
   }
}