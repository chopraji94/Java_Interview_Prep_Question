public class RightCircularRotation {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};

        int size = arr.length;

        for(int i=0;i<size-1;i++){
            int temp = arr[0];
            arr[0] = arr[i+1];
            arr[i+1] = temp;
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
