package Algorithms;

public class CountSortAlgorithm {
    static void countsort(int[]a,int size){
        int max = a[0];
        System.out.println(size);
        //Finding the max element
        for(int i=0;i<size;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        int[] count = new int[max+1];
        for(int i=0;i<=max;i++){
            count[i]=0;
        }


        for(int i=0;i<size;i++){
            count[a[i]]++;
        }

        for(int i=1;i<=max;i++){
            count[i]=count[i]+count[i-1];
        }

        int[] output = new int[size];
        for(int i=size-1;i>=0;i--){
                    output[count[a[i]]-1]=a[i];
                    count[a[i]]--;
        }





       for(int k=0;k<size;k++){
           a[k]=output[k];
       }



    }
}
