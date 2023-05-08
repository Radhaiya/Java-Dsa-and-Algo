package Algorithms;

public class BubbleSortAlgorithm {

/*   Time Complexity = Best O(n) --  Average O(n^2) -- Worst O(n^2)
        Space Complexity = O(1)         */


 public static void bubbleSort(int[] arr){
        int comparison = 0;
        int n= arr.length;

        for(int i=0;i<n-1;i++) {

         boolean swap = false;

            for (int j = 0; j < n - 1 -i; j++) {
                comparison++;
                if (arr[j] > arr[j + 1]) {
                    swapped(arr,j,j+1);
                    swap = true;
                }
            }

            if(!swap){
                break;
            }
        }
        System.out.println(" ");
        System.out.println("It has " + comparison + " comparisons");
    }




    //Swapping
    static void swapped(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j]= temp;
    }
}
