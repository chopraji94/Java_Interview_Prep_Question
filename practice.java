
import java.util.*;

public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<num;i++){
            String str = sc.nextLine();
            Set<String> set = new HashSet<String>();
            List<String> newList = Arrays.asList(str.split(" "));
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<newList.size();j++){
                String word = newList.get(j);
                boolean check = false;
                for(String item : set){
                    if(item.equalsIgnoreCase(word)){
                        check = true;
                        break;
                    }
                }

                if(check == false){
                    set.add(word);
                    sb.append(word+" ");
                }
            }
            
            String newString = new String(sb).trim();
            System.out.println(newString);
            
        }
    }   
}
