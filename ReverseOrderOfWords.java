public class ReverseOrderOfWords {
    public static void main(String[] args) {
        String str = "Pranav Chopra";

        String reveString = "";

        String[] strList = str.split(" ");

        for(int i=strList.length-1;i>=0;i--){
            reveString = reveString + strList[i] + " ";
        }

        System.out.println(reveString);
    }
}
