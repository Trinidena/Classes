public class ArraysInParameterizedTypes
{
   public static void main(String[] args)
   {
      Sequence<String> s1 = new Sequence<>(10);
      s1.set(0, "a");
      s1.set(1, "b");
      s1.set(2, "c");
      System.out.println(s1.get(0));
      System.out.println(s1.get(1));
      System.out.println(s1.get(2)); 
      
      Sequence<Boolean> s2 = new Sequence<>(15);
      s2.set(0, true);
      s2.set(1, true);
      s2.set(2, false);
      System.out.println(s2.get(0));
      System.out.println(s2.get(1));
      System.out.println(s2.get(2));                 
   }
}