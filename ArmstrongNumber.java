import java.util.*;
public class ArmstrongNumber {
    public static boolean is_armstrong(int number){
        int numDigits = String.valueOf(number).length();
        int total = 0;
        int temp = number;
        while(temp>0){
            int digit = temp%10;
            total += Math.pow(digit, numDigits);
            temp /= 10;
        }
        return total == number;

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to check if it is armstrong number or not:");
        int number = s.nextInt();
        if(is_armstrong(number)){
            System.out.println(number + " is a armstrong number.");
        }
        else{
            System.out.println(number + " is not a armstrong number.");
        }
        s.close();
    }
    
}
