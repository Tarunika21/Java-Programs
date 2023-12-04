import java.util.*;
public class PrimeNumbers {
    public static ArrayList<Integer> generatePrimes(int m, int n){
        ArrayList<Integer> prime = new ArrayList<Integer>();
        for(int i=m;i<n;i++){
            if(i ==0 || i == 1){
                continue;
            }
            boolean isPrime = true;
            for(int j=2;j<= i/2; j++){
                if(i%j ==0){
                    isPrime = false;
                }
            }
            if(isPrime){
                prime.add(i);
            }
        }
        return prime;
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting range:");
        int m = s.nextInt();
        System.out.print("Enter the ending range:");
        int n = s.nextInt();
        ArrayList<Integer> result = generatePrimes(m, n);
        if (result.isEmpty()) {
            System.out.println("There are no prime numbers in this range");
        } else {
            System.out.println("The prime numbers in this range are: " + result);
        }
    }
}
