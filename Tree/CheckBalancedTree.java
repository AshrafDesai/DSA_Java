package Tree;

import java.util.Scanner;

public class CheckBalancedTree {

    static class Node 
    {
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
    Node buildTree() 
    {
        System.out.println("Enter the data (-1 for no node):");
        int data = sc.nextInt();

        if (data == -1) 
        {
            return null;
        }
        Node newNode = new Node(data);
        System.out.println("Enter the data to insert left of " + data + ":");
        newNode.left = buildTree();

        System.out.println("Enter the data to insert right of " + data + ":");
        newNode.right = buildTree();

        return newNode;
    }
    static class HeightBalancedPair 
    {
        int height;
        boolean isBalanced;

        HeightBalancedPair(int height, boolean isBalanced) 
        {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }
    public static HeightBalancedPair isBalanced(Node root) 
    {
        if (root == null) 
        {
            return new HeightBalancedPair(0, true);
        }

        HeightBalancedPair left = isBalanced(root.left);
        HeightBalancedPair right = isBalanced(root.right);

        boolean heightDiff = Math.abs(left.height - right.height) <= 1;
        boolean isBalanced = left.isBalanced && right.isBalanced && heightDiff;

        int height = Math.max(left.height, right.height) + 1;

        return new HeightBalancedPair(height, isBalanced);
    }

    public static void main(String[] args) 
    {
        CheckBalancedTree tree = new CheckBalancedTree();
        tree.root = tree.buildTree();

        HeightBalancedPair result = isBalanced(tree.root);
        if (result.isBalanced) 
        {
            System.out.println("The tree is balanced.");
        } 
        else 
        {
            System.out.println("The tree is not balanced.");
        }
    }
}
