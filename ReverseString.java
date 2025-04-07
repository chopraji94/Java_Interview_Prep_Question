import java.util.*;

public class ReverseString{
    // public static void main(String[] args){
    //     String str = "Pranav";
    //     String r = "";

    //     char ch;

    //     for(int i=0;i<str.length();i++){
    //         ch = str.charAt(i);
    //         r = ch+r;
    //     }

    //     System.out.println(r);
    // }
    public static void main(String[] args) {
        String s = "Pranav";

        char[] arr = s.toCharArray();

        String r = "";

        for (char c : arr) {
            r = c+r;
        }

        System.out.println(r);
    }
}