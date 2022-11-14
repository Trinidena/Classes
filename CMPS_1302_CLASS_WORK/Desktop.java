public class Desktop extends Device {
   private String ram;

   public Desktop(String manufacturer, double price, String ram) {
      super(manufacturer, price);
      this.ram = ram;
   }

   @Override
   public String toString() {
      return String.format("%s Ram: %s.", super.toString(), ram);
   }

   public String getRam() {
      return ram;
   }

   public void setRam() {
      this.ram = ram;
   }
}