public class BalancedParentheses
{
   public static void main(String[] args)
   {
      System.out.println(isBalanced(""));
      System.out.println(isBalanced("()"));
      System.out.println(isBalanced("(("));
      System.out.println(isBalanced("))"));
      System.out.println(isBalanced("(5+2)/[6-9]"));
      System.out.println(isBalanced("{(5+2)/3+6}*[(6-9)*2]"));
      System.out.println(isBalanced("(5+2)/{6-9]*[3+9"));
      System.out.println(isBalanced("5+2)/{6-9]*[3+9"));
   }
   
   public static boolean isBalanced(String in)
   {
      MyStack<String> stack = new MyStack<>();
      for(int i = 0; i < in.length(); i++)
      {
         String str = in.substring(i , i+1);
         if(str.equals("(") || str.equals("[") || str.equals("{"))
         {
            stack.push(str);
         }
         if(str.equals(")") || str.equals("]") || str.equals("}"))
         {
            String str2 = "";
            if(!stack.isEmpty())
               str2 = stack.peek();
            if(str2.equals("(") && str.equals(")") || 
               str2.equals("[") && str.equals("]") ||
               str2.equals("{") && str.equals("}"))
            {
               stack.pop();
            }
            else
            {
               stack.push(str);
            }
         }
         
      }
      return stack.isEmpty();
   }
}