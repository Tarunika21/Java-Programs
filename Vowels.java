import java.util.*;
public class Vowels {
    public static void vowels_count(String str){
        str = str.replaceAll(" ", "").toLowerCase();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        Set<Character> stringset = new HashSet<>();
        for(char ch: str.toCharArray()){
            if(vowels.contains(ch)){
                stringset.add(ch);
            }
        }

        if (stringset.size() == vowels.size()) {
            System.out.println("The given string contains all the vowels");
        } else {
            System.out.println("The given string does not contain all the vowels");
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = s.nextLine();
        s.close();
        vowels_count(str);
    }
    
}
