public class LandVehicle extends Vehicle
{
   private int numberWheels;
   
   public String toString()
   {
      return String.format("Land vehicle %s has %d wheels and was manufactured by %s.", 
         vehicleIdNumber, numberWheels, manufacturer);
      
      /* Notice that the code for getManufacturer() method is not in the 
         the LandVehicle class.  
             
      /* Why does the above line use methods for id number and manufacturer
         and not for number of wheels? */   
   }  
   public int getNumberWheels()
   {
      return numberWheels;
   }
   
   public void setNumberWheels(int numberWheels)
   {
      this.numberWheels = numberWheels;
   }
}