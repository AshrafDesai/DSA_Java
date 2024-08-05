package Tree;

import java.util.Scanner;

public class IdenticalCheckTree {
    static class Node {
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
    Scanner sc = new Scanner(System.in);

    Node buildTree() {
        System.out.println("Enter the data (-1 for no node):");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node newNode = new Node(data);
        System.out.println("Enter the data to insert left of " + data + ":");
        newNode.left = buildTree();

        System.out.println("Enter the data to insert right of " + data + ":");
        newNode.right = buildTree();

        return newNode;
    }

    public static boolean isIdentical(Node r1, Node r2) {
        if (r1 == null && r2 == null) 
        {
            return true;
        }
        if (r1 == null || r2 == null) 
        {
            return false;
        }

        boolean left = isIdentical(r1.left, r2.left);
        boolean right = isIdentical(r1.right, r2.right);
        boolean value = r1.data == r2.data;

        return left && right && value;
    }

    public static void main(String[] args) {
        IdenticalCheckTree tree1 = new IdenticalCheckTree();
        IdenticalCheckTree tree2 = new IdenticalCheckTree();

        System.out.println("Building Tree 1:");
        tree1.root = tree1.buildTree();

        System.out.println("Building Tree 2:");
        tree2.root = tree2.buildTree();

        if (isIdentical(tree1.root, tree2.root)) 
        {
            System.out.println("The two trees are identical.");
        } 
        else 
        {
            System.out.println("The two trees are not identical.");
        }
    }
}
