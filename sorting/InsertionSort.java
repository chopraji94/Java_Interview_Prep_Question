package sorting;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {40,20,60,10,50,30};

        for(int j=1;j<arr.length;j++){
            int key = arr[j];

            int i=j-1;

            while ((i > -1) && (arr[i] > key)) {
                arr[i+1] = arr[i];
                i--;
            }

            arr[i+1] = key;
        }

        for(int num : arr){
            System.out.print(num+ " ");
        }
    }
}
