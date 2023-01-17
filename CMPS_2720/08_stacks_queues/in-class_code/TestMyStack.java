public class TestMyStack
{
   public static void main(String[] args)
   {
      MyStack<String> stack = new MyStack<>();
      stack.push("b");
      stack.push("c");
      stack.push("d");
      System.out.println(stack.peek());
      System.out.println(stack.pop());    
      System.out.println(stack.pop());
      stack.push("e");
      stack.push("f");
      stack.pop();
      stack.push("g");      
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      //System.out.println(stack.pop());            
   }
}