package Searching;

public class Main {
    public static void main(String[] args) {
        int[]ar= {2,12,8,9,3,7,5};
        int[] sortedar = {1,2,3,6,8,12,16,12};
        int size = ar.length;

        //int x = LinearSearch.linearsearch(ar,size,0);
        //System.out.println(x);
        int x = BinarySearch.binarySearch(sortedar,0, sortedar.length-1,6);
        System.out.println(x);
    }
}
