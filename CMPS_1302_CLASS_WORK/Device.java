public class Device
{
   protected String manufacturer;
   protected double price;
   
   public Device(String manufacturer , double price)
   {
      this.manufacturer = manufacturer;
      this.price = price;   
   }
   @Override
   public String toString()
   {
      return String.format("Manufacturer: %s. Price: $%,.2f." , manufacturer , price);
   }
   
   public String getManufacturer()
   {
      return manufacturer;
   }
   public double getPrice()
   {
      return price;
   }
   public void setManufacturer(String manufacturer)
   {
      this.manufacturer = manufacturer;
   }
   public void setPrice(double price)
   {
      this.price = price;
   }
}