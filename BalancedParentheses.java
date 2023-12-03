import java.util.*;
public class BalancedParentheses {
    public static boolean isBalancedOarentheses(String str){
        Stack<Character> stack= new Stack<Character>();
        for(char ch:str.toCharArray()){
            if(ch == '(' || ch =='[' || ch=='{' || ch=='<'){
                stack.push(ch);
            }
            else if(ch == ')' || ch ==']' || ch=='}' || ch=='>'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch == ')' && top!='(') || (ch ==']' && top!=']') || (ch=='}' && top!='{') || (ch=='>' && top!='<')){
                    return false;
                }
            }
            
        }
        return stack.isEmpty(); 
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the expression:");
        String str = s.nextLine();
        if(isBalancedOarentheses(str)){
            System.out.println("The given expression " + str + " contains balanced parentheses.");
        }
        else{
             System.out.println("The given expression " + str + " does not ontains balanced parentheses.");
        }
        s.close();
    }
}
