package sorting;

import java.util.*;
import java.util.stream.Collectors;

public class MergeSort {

    public static void Merge(List<Integer> arr,int low,int mid,int high){
        List<Integer> newArr = new ArrayList<Integer>();

        int left = low;
        int right = mid+1;

        while ((left<=mid) && (right<=high)) {
            if(arr.get(left) <= arr.get(right)){
                newArr.add(arr.get(left));
                left++;
            }
            else{
                newArr.add(arr.get(right));
                right++;
            }
        }

        while ((left<=mid)) {
            newArr.add(arr.get(left));
            left++;
        }

        while (right<=high) {
            newArr.add(arr.get(right));
            right++;
        }
        
        for(int i=low;i<=high;i++){
            arr.set(i, newArr.get(i-low));
        }
    }

    public static void MergeAndSort(List<Integer> arr,int low,int high){
        if(low >= high)
            return;
        int mid = (low+high)/2;
        MergeAndSort(arr, low, mid);
        MergeAndSort(arr,mid+1,high);
        Merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3,2,4,1,3); 
        MergeAndSort(arr, 0, arr.size()-1);
        System.out.println(arr.toString());

    }
}
