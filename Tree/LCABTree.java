package Tree;

import java.util.Scanner;

public class LCABTree 
{
    static class Node 
    {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
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

    public static Node lca(Node root, int n1, int n2) 
    {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) 
        {
            return root;
        }

        Node leftAns = lca(root.left, n1, n2);
        Node rightAns = lca(root.right, n1, n2);

        if (leftAns != null && rightAns != null) 
        {
            return root;
        }

        return (leftAns != null) ? leftAns : rightAns;
    }

    public static void main(String[] args) 
    {
        LCABTree tree = new LCABTree();
        tree.root = tree.buildTree();

        System.out.println("Enter the first node value:");
        int n1 = tree.sc.nextInt();

        System.out.println("Enter the second node value:");
        int n2 = tree.sc.nextInt();

        Node lcaNode = lca(tree.root, n1, n2);

        if (lcaNode != null) {
            System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + " is: " + lcaNode.data);
        } else {
            System.out.println("No Common Ancestor Found.");
        }
    }
}
