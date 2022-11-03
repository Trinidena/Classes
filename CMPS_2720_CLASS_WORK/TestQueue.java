public class TestQueue
{
   public static void main(String[] args)
   {
      MyQueue<String> q = new MyQueue<>();
      
      q.add("a");
      q.add("b");
      q.add("c");
      System.out.println(q.peek());
      System.out.println(q.remove());
      System.out.println(q.peek());
      System.out.println(q.remove());
      System.out.println(q.remove());
      //System.out.println(q.remove());
      //System.out.println(q.peek());
   }
}