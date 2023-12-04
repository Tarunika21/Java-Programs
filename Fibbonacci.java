import java.util.*;
class Fibonacci{
    public static ArrayList<Integer> generateFibonacci(int term) {
        if (term < 0) {
            System.out.println("Invalid input");
            return null;
        }

        ArrayList<Integer> values = new ArrayList<>();
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = firstTerm + secondTerm;

        values.add(firstTerm);
        values.add(secondTerm);

        for (int i = 2; i <= term; i++) {
            values.add(thirdTerm);
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = firstTerm + secondTerm;
        }

        return values;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int term = s.nextInt();
        s.close();
        System.out.println("The fibonacci series is:");
        ArrayList<Integer> result = generateFibonacci(term);
        System.out.println(result);
    }
}