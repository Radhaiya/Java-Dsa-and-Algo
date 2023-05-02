package Algorithms;

import Algorithms.*;


public class Main {
    public static void main(String[] args) {
      int[] arr = {50,40,30,20,10,60,80,70};
      int[] arr2 = {2,2,4,5,9,8,3,1};
      int size = arr.length;
      System.out.print("Original Array : ");
      printArr(arr2);
        System.out.println(" ");


//     Algorithms.BubbleSortAlgorithm.bubbleSort(arr);
//      System.out.print("Bubble Sorted Array : ");

        //MergeSortAlgorithm.mergeSort(arr,0,arr.length-1);
     // System.out.print("Merge Sorted Array : ");
//
//        Algorithms.QuickSortAlgorithm.quickSort(arr,0,size-1);
//        System.out.println("Quick Sorted Array is : " );
//        printArr(arr);
//
//        Algorithms.SelectionSortAlgorithm.minimum(arr);
//        printArr(arr);

//        Algorithms.InsertionSortAlgorithm.check(arr);
//        printArr(arr);

        Algorithms.CountSortAlgorithm.countsort(arr2,arr2.length);
        printArr(arr2);


    }





    //Printing The array
    static void printArr(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }



}