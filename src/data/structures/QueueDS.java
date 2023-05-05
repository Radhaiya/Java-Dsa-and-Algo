package data.structures;
import java.util.*;
import java.util.LinkedList;

public class QueueDS {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(56);
        queue.remove();

        System.out.println(queue.peek());
    }
}

class QueueUsingArray {
    private int[] arr;
    private int index;
    private int capacity;

    QueueUsingArray(int capacity){
        this.capacity = capacity;
        this.arr = new int [capacity];
        this.index = -1;
    }

   public void add(int element){

        if(isFull()){
            System.out.println("Queue is Full");
        }
        else {
            index++;
            arr[index]=element;
        }

   }

   public void remove(){

        if(isEmpty()){
            System.out.println("Queue is already Empty");
        }
        else{
            for(int i=0;i<index;i++){
                arr[i]=arr[i+1];
            }
            index--;
        }

   }

   public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else {
            return arr[0];
        }

   }

   public boolean isEmpty(){
        return index == -1;
   }

   public boolean isFull(){
        return index==capacity-1;
   }


    public static void main(String[] args) {
        QueueUsingArray q1 = new QueueUsingArray(5);

        q1.remove();
        int top = q1.peek();
        System.out.println(top);
    }
}