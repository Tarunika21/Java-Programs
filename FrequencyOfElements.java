import java.util.*;
public class FrequencyOfElements {
   public static Map<Integer, Integer> frequencyOfElements(int[] array){
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        for(int i: array){
            if(result.containsKey(i)){
                result.put(i, result.get(i)+1);
            }
            else{
                result.put(i, 1);
            }
        }
        return result;
   } 
   public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements of the arary:");
        for(int i=0;i<n;i++){
            array[i] = s.nextInt();
        }
        Map<Integer, Integer> result = frequencyOfElements(array);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
        s.close();
   }
}
