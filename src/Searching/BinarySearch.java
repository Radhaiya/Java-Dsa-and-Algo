package Searching;

public class BinarySearch {
    public static int binarySearch(int[] a, int L, int R, int x){
        if(L<=R){
            int mid = (L + R) / 2;
            if (x == a[mid]) {
                return mid;
            }
            if (x > mid) {
             return binarySearch(a, mid + 1, R, x);
            }
            if (x < mid) {
               return binarySearch(a, L, mid - 1, x);
            }
        }
            return -1;
    }
}
