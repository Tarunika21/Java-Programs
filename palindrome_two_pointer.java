import java.util.*;
public class palindrome_two_pointer {

    public static boolean isPalindrome(String s){
        int low = 0, high = s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
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
