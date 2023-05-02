package Searching;

public class LinearSearch {
    static int linearsearch(int[]a ,int size,int x){
        for(int i=0;i<size;i++) {
            if (a[i] == x) {
                return 1;
            }
        }
        return -1;
    }
}
