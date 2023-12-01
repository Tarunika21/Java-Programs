import java.util.Scanner;

public class Dutch_flag {
    public static void dutch_flag(int[] array) {
        int low = 0, high = array.length - 1, mid = 0;
        while (mid <= high) {
            if (array[mid] == 0) {
                sort(array, mid, low);
                mid++;
                low++;
            } else if (array[mid] == 2) {
                sort(array, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    public static void sort(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = s.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the terms:");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        dutch_flag(array);
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        s.close();
    }
}
