package Linklist;
// import java.util.*;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; // for counting size

    // addFirst
    void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
    // add newNode on head
        head = newNode;
    }

    // addLast

    void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }


    // for add a node on middle 
    public void add(int idx, int data) {

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;

        while (i < idx - 1) { // for previous node
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    // traversalling in linkList

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Null");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addLast(12);
        ll.addLast(10);
        ll.add(2, 20);
        ll.display();
        System.out.println(size);

    }
}
