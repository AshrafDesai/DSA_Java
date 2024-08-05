package Tree;

import java.util.Scanner;

public class CheckSumTree {
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

    static class Result {
        boolean isSumTree;
        int sum;

        Result(boolean isSumTree, int sum) {
            this.isSumTree = isSumTree;
            this.sum = sum;
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

    public static Result isSumTree(Node root) 
    {
        if (root == null) 
        {
            return new Result(true, 0);
        }
        if (root.left == null && root.right == null) 
        {
            return new Result(true, root.data);
        }

        Result leftResult = isSumTree(root.left);
        Result rightResult = isSumTree(root.right);

        boolean isSumTree = leftResult.isSumTree && rightResult.isSumTree && 
                            (root.data == leftResult.sum + rightResult.sum);

        int sum = leftResult.sum + rightResult.sum + root.data;

        return new Result(isSumTree, sum);
    }

    public static void main(String[] args) {
        CheckSumTree tree = new CheckSumTree();
        tree.root = tree.buildTree();
        Result result = tree.isSumTree(tree.root);

        if (result.isSumTree) {
            System.out.println("The tree is a Sum Tree.");
        } else {
            System.out.println("The tree is not a Sum Tree.");
        }
    }
}
