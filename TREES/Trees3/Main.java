/* 
    This Project contains the following functions:

    -Inserting a Node
    -Deleting a Node
    -Searching a Node
    -Traversing a tree

*/
package Trees3;

import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);
    protected Node root;

    Main() {
        this.root = null;
    }

    class Node {

        Node left;
        Node right;
        int val;

        Node(int val) {
            left = null;
            right = null;
            this.val = val;
        }
    }

    private void menu() {
        int choice = 0;
        while (choice != 5) {
            try {
                System.out.println("Main Menu");
                System.out.println("[1] Insert");
                System.out.println("[2] Delete");
                System.out.println("[3] Search");
                System.out.println("[4] Traverse");
                System.out.println("[5] Quit");
                System.out.print("Select your choice: ");
                choice = in.nextInt();

                in.nextLine();
                if (choice <= 5 && choice >= 1) {
                    selectChoice(choice);
                    continue;
                }

                System.out.println("Enter only the given Number.");
            } catch (Exception e) {
                in.next();
                System.out.println("Enter a Number.");
            }
        }
        System.out.println("Exiting the Program.");
    }

    private void selectChoice(int choice) {
        switch (choice) {
            case 1:
                insertNode();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                traverseMenu();
                break;
        }
    }

    private void insertNode() {
        int val = 0;
        String choice = "Y";
        while (choice.toUpperCase().equals("Y")) {
            try {
                System.out.print("Insert a value: ");
                val = in.nextInt();
                in.nextLine();

                root = insert(val, root);

                System.out.println("Number Inserted!");
                System.out.println("Would you like to continue?[Y]");
                System.out.print("Press any key to cancel...: ");
                choice = in.nextLine();

            } catch (Exception e) {
                in.next();
                System.out.println("Enter a valid Number!");
            }
        }
        System.out.println("Returning to Main Menu...");
    }

    private Node insert(int val, Node node) {

        if (node == null) {
            return new Node(val);
        }

        if (val < node.val) {
            node.left = insert(val, node.left);
        } else if (val > node.val) {
            node.right = insert(val, node.right);
        }

        return node;
    }

    private void traverseMenu() {
        int choice = 0;

        while (choice != 4) {
            try {
                System.out.println("Traversal Menu");
                System.out.println("[1] Inorder Traversal");
                System.out.println("[2] Preorder Traversal");
                System.out.println("[3] Postorder Traversal");
                System.out.println("[4] Back");
                System.out.print("Select your choice: ");
                choice = in.nextInt();

                in.nextLine();

                if (choice >= 1 && choice <= 4) {
                    traverseChoice(choice);
                    continue;
                }

                System.out.println("Enter a valid Number!");
            } catch (Exception e) {
                in.next();
                System.out.println("Enter a valid Number!");
            }
        }
        System.out.println("Returning to Main Menu...");
    }

    private void traverseChoice(int choice) {
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
    }

    private void preOrderTraversal(Node node) {
        System.out.println(node.val);

        if (node.left != null) {
            preOrderTraversal(node.left);
        }

        if (node.right != null) {
            preOrderTraversal(node.right);
        }
    }

    private void postOrderTraversal(Node node) {
        if (node.left != null) {
            postOrderTraversal(node.left);
        }

        if (node.right != null) {
            postOrderTraversal(node.right);
        }

        System.out.println(node.val);
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.menu();
    }
}
