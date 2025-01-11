package Trees1;

public class Main {
    class Node {
        Node right;
        Node left;
        int val;

        Node(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    Node root;

    public void insertNode(int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return;
        }
        Node tempNode = root;
        while (tempNode.left != null || tempNode.right != null) {
            if (tempNode.val < root.val) {

            }
            // if (tempNode.val) {

            // }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.insertNode(25);
        main.insertNode(20);
    }
}
