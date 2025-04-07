public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "Pranav Chopra";

        String[] strList = str.split(" ");

        String newStr = "";

        for(String s : strList){
            String reverse = new StringBuilder(s).reverse().toString();
            newStr = newStr + reverse+" ";
        }

        System.out.println(newStr);
    }
}
