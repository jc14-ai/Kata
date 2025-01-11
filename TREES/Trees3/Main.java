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
                System.out.println("MAIN MENU");
                System.out.println("[1] INSERT");
                System.out.println("[2] DELETE");
                System.out.println("[3] SEARCH");
                System.out.println("[4] TRAVERSE");
                System.out.println("[5] QUIT");
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
                break;
        }
    }

    private void insertNode() {
        int val = 0;
        String choice = "N";
        while (!choice.equals("Y")) {
            try {
                System.out.print("Insert a value: ");
                val = in.nextInt();
                in.nextLine();

                insert(val, root);

                System.out.println("Number Inserted!");
                System.out.print("Would you like to continue?[Y|N]: ");
                choice = in.nextLine();

            } catch (Exception e) {
                in.next();
                System.out.println("Enter a Number!");
            }
        }
    }

    private void insert(int val, Node node) {

        if (root == null) {
            root = new Node(val);
            return;
        }

        if (node == null) {
            return;
        }

        if (val < node.val) {
            insert(val, node.left);
        } else if (val > node.val) {
            insert(val, root.right);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.menu();
    }
}
