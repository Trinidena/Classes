public class TestStack
{
   public static void main(String[] args)
   {
      MyStack<String> stack = new MyStack<>();
      
      //System.out.println(stack.peek());
      stack.push("a");
      stack.push("b");
      stack.push("c");
      System.out.println(stack.peek());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      //System.out.println(stack.pop());
      System.out.println(stack.peek());

   }
}