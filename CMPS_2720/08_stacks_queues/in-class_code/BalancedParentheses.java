public class BalancedParentheses
{
   public static void main(String[] args)
   {
      System.out.println(isBalanced(""));
      System.out.println(isBalanced("()"));      
      System.out.println(isBalanced("(("));
      System.out.println(isBalanced("))"));           
      System.out.println(isBalanced("(5+2)/[6-9]"));
      System.out.println(isBalanced("{(5+2)/3 + 6}*[(6-9)*2]"));
      System.out.println(isBalanced("(5+2)/{6-9]*[3+9"));
      System.out.println(isBalanced("5+2)/{6-9]*[3+9"));                   
   }
   
   public static boolean isBalanced(String in)
   {
      MyStack<Character> stack = new MyStack<>();
      for(int i = 0; i < in.length(); i++)
      {
         //System.out.println(in.charAt(i));
         char currentChar = in.charAt(i);
         if(currentChar == '(' || currentChar == '{' || currentChar == '[')
         {
            stack.push(currentChar);
         }
         else if(currentChar == ')' || currentChar == '}' || currentChar == ']')
         {
            
            char openChar = '\0';
            if(!stack.isEmpty())
            {
               openChar = stack.peek();
            }   
            if( (openChar == '(' && currentChar == ')') || 
                (openChar == '{' && currentChar == '}') ||
                (openChar == '[' && currentChar == ']'))
                stack.pop();
            else
            {
               stack.push(currentChar);
            }               
         }
      }
      return stack.isEmpty();
    }  
}