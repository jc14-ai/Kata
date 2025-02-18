package Trees4;

public class Main {

    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addData(10);
        main.addData(5);
        main.addData(6);
        main.addData(12);

        main.delete(6);
        System.out.println();
        main.inorderTraversal(main.root);
    }

    private void addData(int data) {
        root = newNode(data, root);
    }

    private Node newNode(int data, Node node) {
        if (node == null) {
            node = new Node(data);
        }

        if (data < node.data) {
            node.left = newNode(data, node.left);
        } else if (data > node.data) {
            node.right = newNode(data, node.right);
        }

        return node;
    }

    private void inorderTraversal(Node node) {
        if (node == null)
            return;
        inorderTraversal(node.left);
        System.out.println(node.data);
        inorderTraversal(node.right);
    }

    private void preorderTraversal(Node node) {
        if (node == null)
            return;

        System.out.println(node.data);
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    private void postorderTraversal(Node node) {
        if (node == null)
            return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.println(node.data);
    }

    // Inorder Traversal = 5,6,10,12
    // this section of deletion is wrong
    private void delete(int data) {
        root = search(data, root);
    }

    private Node search(int data, Node node) {
        if (node == null)
            return node;

        if (data == node.data) {

        }

        search(data, node.left);
        search(data, node.right);

        return node;

    }
}
