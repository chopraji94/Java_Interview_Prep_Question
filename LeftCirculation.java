public class LeftCirculation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int size = arr.length;

        for(int i=size-1;i>0;i--){
            int temp = arr[size-1];
            arr[size-1] = arr[i-1];
            arr[i-1] = temp;
        }

        for(int num:arr){
            System.out.print(num + " ");
        }

    }
}
