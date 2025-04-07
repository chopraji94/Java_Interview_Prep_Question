import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharfromString {
    public static void main(String[] args) {
        String str = "Pranav Chopra";

        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        Set<Character> set = new HashSet<Character>();

        for(char c : arr){
            if(!set.contains(c)){
                sb.append(c);
                set.add(c);
            }
        }

        


        System.out.println(sb.toString());

    }
}
