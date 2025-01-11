package Trees2;

import java.util.Scanner;

public class Main {
    public class Node {
        Node left;
        Node right;
        int val;

        Node(int val) {
            this.left = null;
            this.right = null;
            this.val = val;
        }
    }

    private Node root;
    private Scanner in = new Scanner(System.in);

    private void insert(int val) {
        root = insertNode(val, root);
    }

    private Node insertNode(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }

        if (val < node.val) {
            node.left = insertNode(val, node.left);
        } else if (val > node.val) {
            node.right = insertNode(val, node.right);
        }

        return node;
    }

    private void insertMenu() {
        int val = 0;
        while (val != 99) {
            System.out.print("Enter a value to Insert: ");
            val = in.nextInt();

            insert(val);

            System.out.println("Value inserted.");

            in.nextLine();
            System.out.print("Press any key to Enter again otherwise Press [N]: ");
            String choice = in.nextLine();

            switch (choice.toUpperCase()) {
                case "N":
                    System.out.println("Returning...");
                    return;
                default:
                    break;
            }
        }
    }

    private Node searchNode(Node node) {

        return node;
    }

    private Node deleteNode(Node node) {

        return node;
    }

    private Node showTree(Node node) {

        return node;
    }

    private void menu() {
        String choice = "";
        while (!choice.toUpperCase().equals("Q")) {
            System.out.println("Menu");
            System.out.println("BST Tree Operations");
            System.out.println("[S] Show");
            System.out.println("[I] Insert");
            System.out.println("[D] Delete");
            System.out.println("[T] Traverse");
            System.out.println("[Q] Quit");
            System.out.print("Enter your Choice: ");
            choice = in.nextLine();

            switch (choice.toUpperCase()) {
                case "S":
                    showTree(root);
                    break;
                case "I":
                    insertMenu();
                    break;
                case "D":
                    deleteNode(root);
                    break;
                case "T":
                    traverseMenu();
                    break;
                case "Q":
                    System.out.println("Program stopped.");
                    break;
                default:
                    System.out.println("Input not in the choices!");
                    break;
            }
        }

    }

    private void inOrderTraversal(Node node) {
        if (node.left != null) {
            inOrderTraversal(node.left);
        }
        System.out.println(node.val);
        if (node.right != null) {
            inOrderTraversal(node.right);
        }
        return;
    }

    private void preOrderTraversal(Node node) {

    }

    private void postOrderTraversal(Node node) {

    }

    private void traverseMenu() {
        int choice = 0;
        while (choice != 4) {
            System.out.println("TREE TRAVERSAL");
            System.out.println("Menu");
            System.out.println("[1] InOrder");
            System.out.println("[2] PreOrder");
            System.out.println("[3] PostOrder");
            System.out.println("[4] Exit");
            System.out.print("Enter your Choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    inOrderTraversal(root);
                    break;
                case 2:
                    preOrderTraversal(root);
                    break;
                case 3:
                    postOrderTraversal(root);
                    break;
                case 4:
                    System.out.println("Going back...");
                    in.nextLine();
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}
