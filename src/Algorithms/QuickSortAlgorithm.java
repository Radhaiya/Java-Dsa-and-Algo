package Algorithms;


//high = arr.length - 1;
//low = 0;

public class QuickSortAlgorithm {
    public static void quickSort(int[] arr, int low, int high) {
        if(low<high){
        int indexPI = partition(arr,low,high);
        quickSort(arr,low,indexPI-1);
        quickSort(arr,indexPI+1,high);
        }
    }

    static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int swapIndex = low-1;
        for(int i=low;i<=high-1;i++){
            if(arr[i]<pivot){
                swapIndex++;
                swapped(arr,i,swapIndex);
            }
        }
        swapIndex++;
        swapped(arr,swapIndex,high);

        return swapIndex;

    }

    static void swapped(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j]= temp;
    }

}
