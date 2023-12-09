import java.util.*;
public class TwoSum {
    public static int[] twosum(int[] array, int target){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int left = 0;
        int right = array.length-1;
        while(left<right){
            int tempsum = array[left]+array[right];
            if(tempsum == target){
                return new int[]{left,right};
            }
            else if(tempsum<target){
                left+=1;
            }
            else{
                right+=1;
            }
        }
        return new int[]{-1,-1};

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
        System.out.print("Enter the target:");
        int target = s.nextInt();
        int[] result = twosum(array, target);
        System.out.println("Result indices:" + result[0] + "," + result[1]);
        s.close();
    }
}
