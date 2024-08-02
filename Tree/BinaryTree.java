package Tree;
import java.util.Scanner;

public class BinaryTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    Node buildTree() {
        System.out.println("Enter the data:");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node newNode = new Node(data);

        System.out.println("Enter the data to insert left of " + data);
        newNode.left = buildTree();

        System.out.println("Enter the data to insert right of " + data);
        newNode.right = buildTree();

        return newNode;
    }

    void displayTree(Node root, int level) {
        if (root == null) {
            return;
        }

        displayTree(root.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) 
            {
                System.out.print("|\t");
            }
            System.out.println("|-------" + root.data);
        } 
        else 
        {
            System.out.println(root.data);
        }

        displayTree(root.left, level + 1);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.buildTree();
        System.out.println("Tree Structure:");
        tree.displayTree(tree.root, 0);
    }
}
