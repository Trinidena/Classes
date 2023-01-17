public abstract class CellPhone
{
   protected String manufacturer;
   protected String model;
   protected double screenSize;
   protected double price;
   
   public CellPhone(String manufacturer, String model)
   {
      this.manufacturer = manufacturer;
      this.model = model;
   }
   
   public void setManufacturer(String manufacturer)
   {
      this.manufacturer = manufacturer;
   }
   
   public String getManufacturer()
   {
      return manufacturer;
   }
   
   public void setModel(String model)
   {
      this.model = model;
   }
   
   public String getModel()
   {
      return model;
   }

   public void setScreenSize(double screenSize)
   {
      this.screenSize = screenSize;
   }
   
   public double getScreenSize()
   {
      return screenSize;
   }

   public abstract void setPrice();
   
   public double getPrice()
   {
      return price;
   } 
}