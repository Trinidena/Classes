public class Condo
{
   private String view;
   private double price;
   private String parking;
   
   public Condo(String view, String parking)
   {
      if(view.equals("park") || view.equals("golf course") ||
         view.equals("lake"))
      {
         this.view = view;
      }
      else
      {
         this.view = "park";
      }
      
      if(parking.equals("garage") || parking.equals("parking space"))
      {
         this.parking = parking;
      }
      else
      {
         this.parking = "parking space";
      }
      
      if(this.view.equals("golf course"))
      {
         price = 170000;
      }
      else if(this.view.equals("lake"))
      {
         price = 210000;
      }
      else
      {
         price = 150000;
      }
      
      if(this.parking.equals("garage"))
      {
         price = price + 5000;
      }          
   }
   
   @Override
   public String toString()
   {
      return String.format("This condo is a %s view with a "+
         "%s at a price of $%,.2f.%n", view, parking, price);
   }
}