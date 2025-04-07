import java.util.ArrayList;
import java.util.List;

public class PossibleSubstring {
    public static void main(String[] args) {
        String str = "abcd";
        char[] arr = str.toCharArray();
        List<String> list = new ArrayList<String>();

        for(int i=0;i<str.length();i++){
            StringBuilder sb = new StringBuilder(str.length()-i);
            for(int j=i;j<str.length();j++){
                sb.append(arr[j]);
                list.add(sb.toString());
            }
        }

        for(String s : list){
            System.out.print(s+" ");
        }
    }
}
