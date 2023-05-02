package data.structures;

import java.util.ArrayList;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Object>obs = new Stack<>();
        obs.push(2365);
        st.push(10);
        st.pop();
        st.push(10);
        st.push(12);
        st.push(19);
        st.push(14);
        boolean x = st.empty();                         //returns boolean is for stack is empty or not
        int index = st.search(12);                  // searches forr element and returns its distance from top/-1 if not
        int size = st.capacity();                       //returns the size of the stack;

        String a = st.toString();                       //convert to string
        Object  [] ar= st.toArray();                    //convert to object
        int y = st.elementAt(0);

        System.out.println(st);
    }

}



// Implememtation of stack using an array
class StackUsingArray {
    private int arr[];
    private int capacity;
    private int top;


    //constructor
    public StackUsingArray(int capacity){
        this.arr = new int[capacity];
        this.top=-1;
        this.capacity = capacity;
    }

    //Methods;

    //Pushing an Element
   public void push(int x){
        if(isFull()) {
            System.out.println("Stack is Full cannot add " + x);
        }
        else{
            top++;
            arr[top]=x;
        }
    }


    //Popping an Element
    public int pop(){
        if(isEmpty()){
            System.out.println("Cannot Pop stack is empty");
            return -1;
        }
        else{
            int element = arr[top];
            top--;
            return element;
        }
    }

    //is Full
    boolean isFull(){
        return (top == capacity-1);
    }

    //is Empty
    boolean isEmpty(){
        return( top==-1);
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return arr[top];
        }
    }
}

class Main{
    public static void main(String[] args) {
        StackUsingArray s1 = new StackUsingArray(3);
        s1.push(12);
        s1.push(23);
        s1.push(45);
        s1.pop();
        s1.push(12);
    int top = s1.peek();
        System.out.println(top);
    }
}