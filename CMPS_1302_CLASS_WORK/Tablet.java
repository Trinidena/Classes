public class Tablet extends Device
{
   private String screenSize;
   
   public Tablet(String manufacturer , double price , String screenSize)
   {
      super(manufacturer , price);
      this.screenSize = screenSize;
   }
   
   public String toString()
   {
      return String.format("%s Screen Size: %s" , super.toString() , screenSize);
   }
   
   public String getScreenSize()
   {
      return screenSize;
   }
   public void setScreenSize(String screenSize)
   {
      this.screenSize = screenSize;
   }
}