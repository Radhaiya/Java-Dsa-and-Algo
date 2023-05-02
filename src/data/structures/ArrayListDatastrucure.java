package data.structures;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListDatastrucure {

    public static void main(String[] args) {


        ArrayList<Integer>A = new ArrayList<>();        //Generates Empty ArrayList;

        A.add(12);                                      //Adds Element at the end
        A.add(15);                                      //Adds Element at the end
        A.add(25);                                      //Adds Element at the end
        A.add(96);                                      //Adds Element at the end

        A.remove(1);                               //Removes Element at Index 1 and shift elements to left

        int size = A.size();                            //Returns Int Size of Arraylist
//        A.clear();                                      //Empties whole Array

        int ans = A.indexOf(125);                       //Returns index of passed Object or -1
        boolean present = A.contains(12);               //true if given obj is present
        boolean isEmpty = A.isEmpty();                  //Check if AL is empty
        A.addAll(A);                                     //Adds another array at the end;


//        System.out.println(ans);
//        System.out.println(size);
//        System.out.println(A);
//

    }
}
