import java.util.*;
public class palindrome {

    public static boolean isPalindrome(String s){
        String rev="";
        boolean ans=false;
        for(int i= s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            ans = true;
        }
        
        return ans;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = s.nextLine();
        str = str.replaceAll(" ", "").toLowerCase();
        boolean result = isPalindrome(str);
        if(result){
            System.out.println("The given string is a palindrome.");
        }
        else{
            System.out.println("The given string is not a palindrome.");
        }
        s.close();
    }
    
}
