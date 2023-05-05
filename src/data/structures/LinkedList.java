package data.structures;

public class LinkedList {
    private int data;
    private LinkedList next;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList() {
        this.head = new Node(data);
    }
}
