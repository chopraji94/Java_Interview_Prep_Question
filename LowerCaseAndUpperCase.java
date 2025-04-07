public class LowerCaseAndUpperCase {
    public static void main(String[] args) {
        String word = "Welcom to Java Training";
        char[] arr = word.toCharArray();

        for (char c : arr) {
            if(c>=65 && c<=90){
                System.out.println(c);
            }
        }
    }
}
