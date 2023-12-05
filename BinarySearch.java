import java.util.*;
public class BinarySearch {
    public static int binarysearch(int[] array, int target){
        int low = 0, high = array.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            array[i] = s.nextInt();
        }
        System.out.print("Enter the element to search:");
        int target = s.nextInt();
        int result = binarysearch(array, target);
        if(result != -1){
            System.out.println("The element is present at the index:" + result);
        }
        else{
            System.out.println("The element is not found.");
        }
        s.close();
    }
}
