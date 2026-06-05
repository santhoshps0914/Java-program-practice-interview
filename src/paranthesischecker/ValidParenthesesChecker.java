package paranthesischecker;

import java.util.Stack;

public class ValidParenthesesChecker {
    
    private ValidParenthesesChecker() {
        /* This utility class should not be instantiated */
    }

    
    public static boolean isParenthesesBalanced(String str){
        if (str.isEmpty()){
            return false;
        }

        Stack<Character> characterStack = new Stack<>();
        
        for (char ch : str.toCharArray()){
            //1. put opening brackets to stack
            if (ch=='(' || ch=='{' || ch=='['){
                characterStack.push(ch);
            } else if (ch==')' || ch=='}' || ch==']') {
                //2. if there is no opening bracket return false
                if (characterStack.isEmpty()){
                    return false;
                }
                char topElement = characterStack.peek();
                
                if ((ch==')' && topElement!='(') || 
                        (ch=='}' && topElement!='{') ||
                        (ch==']' && topElement!='[')
                ){
                    return false;
                }
                characterStack.pop();
            }

        }
        
        // if characterStack is empty then return false
        return characterStack.isEmpty();
        
    }
    

    public static void main(String[] args) {
        
        System.out.println(isParenthesesBalanced("{{{}}}"));
        System.out.println(isParenthesesBalanced("{}{}{{}}"));
        System.out.println(isParenthesesBalanced("{{}}}"));
        System.out.println(isParenthesesBalanced("{{{}}"));
        System.out.println(isParenthesesBalanced("{}}{}{"));
    }
    
    
    
}
