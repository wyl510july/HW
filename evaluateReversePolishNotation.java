package px;
import java.util.*;

public class evaluateReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = {"0","3","/"};
			System.out.println(evalRPN(tokens));
	}
	
	public static int evalRPN(String[] tokens) {
        if(tokens == null){
            return 0;
        }else if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }else{
        int front;
        int end;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<tokens.length;i++){
        	if(isNotation(tokens[i])){
        		end =  stack.pop();
    	        front = stack.pop();
        		if(tokens[i].equals("+")){	
                    stack.push(front + end);
                }else if(tokens[i].equals("-")){
                    stack.push(front - end);
                }else if(tokens[i].equals("*")){
                    stack.push(front * end);
                }else{
                    stack.push(front / end);
                 
                }
        	}else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
    }
	
	private static boolean isNotation(String nota){
		if(nota.equals("+") || nota.equals("-") ||nota.equals("*") || nota.equals("/")){
			return true;
		}return false;
	}


}

