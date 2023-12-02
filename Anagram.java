import java.util.*;
public class Anagram {
    
    public static boolean isAnagram(String str1, String str2){
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first string 1:");
        String str1 = s.nextLine();
        System.out.print("Enter the first string 2:");
        String str2 = s.nextLine();
        if(isAnagram(str1, str2)){
            System.out.println("The strings " + str1 + " and " + str2 + " are anagrams.");
        }
        else{
            System.out.println("The strings " + str1 + " and " + str2 + " are not anagrams.");
        }
        s.close();

    }
}
