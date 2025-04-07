package sorting;

public class Selectionsort {
    public static void main(String[] args){
        int[] arr = {10,9,11,6,15,2};

        for(int i=0;i<arr.length;i++){
            int min = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int num : arr){
            System.out.print(num+ " ");
        }
    }
}
