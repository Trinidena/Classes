public class Apartment
{
   private String address;
   private int apartmentNumber;
   private int numberBedrooms;
   private double rent;
   
   public Apartment(String address, int apartmentNumber, int numberBedrooms, double rent) throws ApartmentException
   {
      this.address = address;
      this.apartmentNumber = apartmentNumber;
      this.numberBedrooms = numberBedrooms;
      this.rent = rent;
      
      if(apartmentNumber < 100 || apartmentNumber > 999 || numberBedrooms < 1 || numberBedrooms > 4 ||
         rent < 500.0 || rent > 2500.0)
      {
         throw new ApartmentException(String.format("%s,%d,%d,%f", address, apartmentNumber,
            numberBedrooms, rent));
      }
   }
   
   @Override
   public String toString()
   {
      return String.format("%s,%d,%d,%f", address, apartmentNumber,
            numberBedrooms, rent);
   }
}