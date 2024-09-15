package Linklist;

public class Linklist2 {
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

    void addFirst(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.print("null");
            return;
        }
        while (temp != null) {
            System.out.print("[ Value: "+ temp.data + "|Add: " + temp.next + "]");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linklist2 l1 = new Linklist2();
        l1.addFirst(1);
        l1.print();

        l1.addFirst(2);
        l1.print();

        l1.addFirst(3);
        l1.print();

        l1.addFirst(4);
        l1.print();

    }
}
