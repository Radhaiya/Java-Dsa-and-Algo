package Algorithms;

public class SelectionSortAlgorithm {
    public static void minimum(int[] a){
        for(int i=0;i<a.length;i++){
            int minIdx = i;
            int min = a[i];
            for(int j=i+1 ;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    minIdx = j;
                }
            }
            swap(a,minIdx,i);
        }
    }
    static void swap(int[]a,int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
