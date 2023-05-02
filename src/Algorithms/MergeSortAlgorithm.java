package Algorithms;

public class MergeSortAlgorithm {
    public static void mergeSort(int[] a, int left, int right){

        int mid ;
        if(left<right){
            mid = (left+right)/2;
            mergeSort(a, left, mid);
            mergeSort(a,mid+1,right);
            merge(a ,left,mid,right);
        }
    }

    static void merge(int[] arr,int left ,int mid,int right){
//        System.out.println(left + " and " +  mid + " and "+   right);
        System.out.println("_________________");

            int n1 = mid -left +1;
            int n2 = right-mid;

            int[] L = new int[n1];
            int[] R = new int[n2];

        System.out.println("Left Sub Array");
            for(int i=0;i<n1;i++){
                L[i]=arr[left+i];

                System.out.print(  L[i]+ " ");
            }
        System.out.println(" ");
        System.out.println("Right Sub Array");
            for(int j=0;j<n2;j++){
             R[j] = arr[mid+1+j];
                System.out.print( R[j]+" ");
            }
        System.out.println(" ");

            int i=0;
            int j=0;
            int k=left;

            while(i<n1 && j<n2){
                if(L[i]<=R[j]){
                    arr[k]=L[i];
                    i++;k++;
                }
                else{
                    arr[k]=R[j];
                    j++;k++;
                }
            }

            while (i<n1){
                arr[k]=L[i];
                i++;k++;
            }

        while (j<n2){
            arr[k]=R[j];
            j++;k++;
        }

        System.out.println("Merged Array is ");
        for (int r:arr){
            System.out.print(r+" ");
        }

        System.out.println(" ");
    }
}
