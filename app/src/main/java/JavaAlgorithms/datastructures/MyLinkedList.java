package JavaAlgorithms.datastructures;

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public boolean add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;

        return true;
    }

    public int get(int index) {
        if (!isValidIndex(index)) throw new IndexOutOfBoundsException();

        Node current = head;
        for (int i=0; i<index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int remove() {
        if (isEmpty()) throw new IndexOutOfBoundsException();

        int removed = head.data;
        head = head.next;
        return removed;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return this.size;
    }

    boolean isValidIndex(int index) {
        return index >= 0 && index<size;
    }
}
