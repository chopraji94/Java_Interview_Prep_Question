public class OverLapingStringInaString {
    public static void main(String[] args) {
        String str = "TimisplayinginthehouseofTimwiththeTim";
        
        System.out.println("Overlapping substrings:");
        findOverlappingSubstrings(str);
    }

    public static void findOverlappingSubstrings(String str) {
        int n = str.length();
        
        for (int length = 1; length <= n / 2; length++) {
            for (int i = 0; i <= n - length; i++) {
                String substring = str.substring(i, i + length);
                if (str.indexOf(substring, i + 1) != -1) {
                    System.out.println("\"" + substring + "\"");
                }
            }
        }
    }
}
