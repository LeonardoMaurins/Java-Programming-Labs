import java.util.Stack;

public class TestAStack
{
	public static void main(String args[])
	{
		StackReferenceBased stack = new StackReferenceBased();
		
		stack.push("Apple");
		stack.push("Banana");
		
		stack.popAll();
		
		stack.push("Cherry");
		stack.push("Dragon Fruit");
		
		stack.pop();
		
		stack.push("Elder Berry");
		stack.push("Fig");
		
		stack.peek();
		
		StackReferenceBased.displayStack(stack);
		
		String s = "{{{}}";
		
		System.out.println("Is the string '" + s + "' balanced? : " + isBalanced(s));
	}
	
	public static boolean isBalanced(String s){
		
    	Stack<Character> balanceStack = new Stack<Character>();

        for(int i = 0; i < s.length(); ++i) {
        	
            if(s.charAt(i) == '{') {
            	balanceStack.push(s.charAt(i));
            }  	
            else if(!balanceStack.empty() && s.charAt(i) == '}') {
            	balanceStack.pop();
            }
            else if(balanceStack.empty() && s.charAt(i) == '}') {
            	return false;
            }  
        }
        return balanceStack.empty();
    }
    
}