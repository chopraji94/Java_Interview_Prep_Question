public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i : arr){
            if(i > max1){
                max2 = max1;
                max1 = i;
            }
            else if(i > max2 && i != max1){
                max2 = i;
            }
        }

        System.out.println(max2);
    }
}
