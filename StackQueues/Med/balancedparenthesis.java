package StackQueues.Med;

import java.util.Stack;

public class balancedparenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        parenthesis obj = new parenthesis();
        System.out.println(obj.isValid(s));
    }
}
class parenthesis{
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if(c == '(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty() || 
                (c==')' && stack.pop()!='(') ||
                (c==']' && stack.pop()!='[') ||
                (c=='}' && stack.pop()!='{')) {
                return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
