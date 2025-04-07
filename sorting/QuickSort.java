package sorting;
import java.util.*;

public class QuickSort {

    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i=low;
        int j=high;

        while (i < j) {
            while ((arr[i]<=pivot) && (i <= high-1)) {
                i++;
            }
    
            while ((arr[j]>pivot) && (j >= low+1)) {
                j--;
            }
    
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }  
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quickSort(int[] arr,int low ,int high){
        if(low<high){
            int partiorionIndex = partition(arr,low,high);
            quickSort(arr, low, partiorionIndex-1);
            quickSort(arr, partiorionIndex+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,8,9,7,3};
        quickSort(arr, 0, arr.length-1);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
