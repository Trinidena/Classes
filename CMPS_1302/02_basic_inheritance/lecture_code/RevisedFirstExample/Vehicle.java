public class Vehicle
{
   // Fields
   protected String vehicleIdNumber;
   protected String manufacturer;
   
   /* Using the default constructor to simplify things
      in the first example. */
   
   // Methods
   public String toString()
   {
      return String.format("Vehicle %s was manufactured by %s.", vehicleIdNumber, manufacturer);
   }   
   
   // Get and set methods      
   public String getVehicleIdNumber()
   {
      return vehicleIdNumber;
   }

   public void setVehicleIdNumber(String vehicleIdNumber)
   {
      this.vehicleIdNumber = vehicleIdNumber;
   }
      
   public String getManufacturer()
   {
      return manufacturer;
   }
   
   public void setManufacturer(String manufacturer)
   {
      this.manufacturer = manufacturer;
   }
}