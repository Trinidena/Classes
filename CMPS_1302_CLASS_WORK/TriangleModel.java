import java.util.ArrayList;

public class TriangleModel
{
   private double a;
   private double b;
   private double c;
   private ArrayList<String> results;
   
   public TriangleModel()
   {
      a = 0.0;
      b = 0.0;
      c = 0.0;
      results = new ArrayList<>();
   }
   
   @Override
   public String toString()
   {
      String display = "";
      for(String result : results)
      {
         display += result + "\n";
      }
      return display;
   }
   public void addResult(double a , double b)
   {
      this.a = a;
      this.b = b;
      c = Math.sqrt(a * a + b * b);
      results.add(0 , String.format("a: %.2f  b:%.2f   c: %.2f" , a , b , c));
   }
   public double getA()
   {
      return a;
   }
   public double getB()
   {
      return b;
   }
   public double getC()
   {
      return c;
   }
   public void setA(double a)
   {
      this.a = a;
   }
   public void setB(double b)
   {
      this.b = b;
   }
   public void setC(double c)
   {
      this.c = c;
   }
}