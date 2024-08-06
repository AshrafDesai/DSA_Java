package Tree;

import java.util.Scanner;

public class kthAncestor 
{
    static class Node
    {
        int data;
        Node left, right;

        Node(int data) 
        {
            this.data = data;
            left = right = null;
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

    public static Node solve(Node root, int[] k, int node) {
        if (root == null) 
        {
            return null;
        }

        if (root.data == node) 
        {
            return root;
        }

        Node leftAns = solve(root.left, k, node);
        Node rightAns = solve(root.right, k, node);

        if (leftAns != null || rightAns != null) 
        {
            k[0]--;
            if (k[0] == 0) 
            {
                System.out.println("The " + k[0] + "th ancestor is: " + root.data);
                return null;
            }
            return root;
        }
        return null;
    }

    public static void findKthAncestor(Node root, int k, int node) 
    {
        int[] kArr = {k};
        Node ancestor = solve(root, kArr, node);
        if (ancestor == null && kArr[0] > 0) 
        {
            System.out.println("No " + k + "th ancestor found.");
        }
    }

    public static void main(String[] args) 
    {
        kthAncestor tree = new kthAncestor();
        tree.root = tree.buildTree();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k (kth ancestor):");
        int k = sc.nextInt();

        System.out.println("Enter the value of node:");
        int node = sc.nextInt();

        findKthAncestor(tree.root, k, node);
        sc.close();
    }
}
