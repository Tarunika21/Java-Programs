import java.util.*;
public class Panagram {
    public static boolean isPanagram(String str){
        HashSet<Character> unique = new HashSet<Character>(); 
        str = str.replaceAll(" ", "").toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                unique.add(c);
            }
        }
        return unique.size() == 26;

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = s.nextLine();
        
        if(isPanagram(str)){
            System.out.println("The string " + str +  " is panagram.");
        }
        else{
            System.out.println("The string " + str +  " is not panagram.");
        }
        s.close();

    }
}
