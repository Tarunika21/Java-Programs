import java.util.*;
public class CheckPrime {
    public static boolean isPrime(int n) {
        if (n > 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to check:");
        int n = s.nextInt();
        if(isPrime(n)){
            System.out.println("The given number " + n + " is a prime number");
        }
        else{
            System.out.println("The given number " + n + " is not a prime number");
        }
        s.close();
    }
}
