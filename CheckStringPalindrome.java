public class CheckStringPalindrome {
    // public static void main(String[] args) {
    //     String str = "Mam";
    //     String reverse = "";

    //     char[] arr = str.toCharArray();

    //     for (char c : arr) {
    //         reverse = c+reverse;
    //     }

    //     if(str==reverse){
    //         System.out.println("It is palindrome");
    //     }
    //     else{
    //         System.out.println("It is not palindrome");
    //     }
// }
    public static void main(String[] args) {
        String str = "Pranav";
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            System.out.println("It is pallindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
}
