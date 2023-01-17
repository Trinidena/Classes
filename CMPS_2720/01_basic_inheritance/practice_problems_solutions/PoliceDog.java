public class PoliceDog extends Dog
{
   private String policeDept;
   
   public PoliceDog(String name, String color, int birthYear, String policeDept)
   {
      super(name, color, birthYear);
      this.policeDept = policeDept;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s  PD:  %s", super.toString(), policeDept);
   }
   
   public String getPoliceDept()
   {
      return policeDept;
   }
   
   public void setPoliceDept(String policeDept)
   {
      this.policeDept = policeDept;
   }
}