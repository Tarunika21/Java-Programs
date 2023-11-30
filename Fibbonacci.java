import java.util.*;
class Fibonacci{
    static int n1=0, n2=1, n3=0;
    static void fibonacci(int term){  
        if(term>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fibonacci(term-1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int term = s.nextInt();
        s.close();
        System.out.println("The fibonacci series is:");
        System.out.print(n1+" "+n2);
        fibonacci(term-2);

    }
}