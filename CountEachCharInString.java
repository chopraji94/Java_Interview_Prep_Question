import java.util.Map;
import java.util.HashMap;

public class CountEachCharInString {
    public static void main(String[] args) {
        String str = "Pranav Chopra";

        Map<Character,Integer> dict = new HashMap<Character,Integer>();

        char[] arr = str.toCharArray();

        for(char ch : arr){
            if(dict.containsKey(ch)){
                int count = dict.get(ch)+1;
                dict.put(ch,count);
            }
            else{
                dict.put(ch,1);
            }
        }

        for(Object k : dict.keySet()){
            System.out.println(k + " " + dict.get(k));
        }
    }
}
