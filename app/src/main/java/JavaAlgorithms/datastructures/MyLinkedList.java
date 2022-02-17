package JavaAlgorithms.datastructures;

class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
    public Node getNext() {
        return this.next;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}

public class MyLinkedList {
    Node head;
    Node tail;

    public boolean add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        if (tail != null) {
            tail.setNext(newNode);
        }
        tail = newNode;

        return true;
    }
}
