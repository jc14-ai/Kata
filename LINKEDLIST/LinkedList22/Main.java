package LINKEDLIST.LinkedList22;

public class Main {

    Node head;

    Main() {
        this.head = null;
    }

    class Node {
        Node next;

        String val;

        Node(String val) {
            this.val = val;
            this.next = null;
        }
    }

    void add(String val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " -> ");
        display(node.next);

    }

    void pop() {
        Node tempNode = head;
        if (tempNode == null) {
            return;
        }

    }

    public static void main(String[] args) {
        Main main = new Main();

        main.add("Red");
        main.add("Green");
        main.add("Black");
        main.add("White");
        main.add("Pink");

        main.display(main.head);
        System.out.println("Null");
    }
}
