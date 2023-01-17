public class TestMyQueue
{
   public static void main(String[] args)
   {
      MyQueue<String> q = new MyQueue<>();
      q.add("a");
      q.add("b");
      q.add("c");
      q.add("d");
      System.out.println(q.peek());      
      System.out.println(q.remove());
      System.out.println(q.remove());
      q.add("d");
      q.add("e");
      q.remove();
      q.add("f"); 
      System.out.println(q.remove()); 
      System.out.println(q.remove());
      System.out.println(q.remove());
      System.out.println(q.remove());
      //System.out.println(q.remove());                              
   }
}