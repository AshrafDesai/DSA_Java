package Tree;

import java.util.Scanner;

public class BoundaryTraversal 
{
    
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

    public static void traverseLeftBoundary(Node root) 
    {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        System.out.print(root.data + " ");
        if (root.left != null) 
        {
            traverseLeftBoundary(root.left);
        } 
        else 
        {
            traverseLeftBoundary(root.right);
        }
    }

    public static void traverseLeafNodes(Node root) 
    {
        if (root == null) 
        {
            return;
        }
        if (root.left == null && root.right == null) 
        {
            System.out.print(root.data + " ");
            return;
        }
        traverseLeafNodes(root.left);
        traverseLeafNodes(root.right);
    }

    public static void traverseRightBoundary(Node root) 
    {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        if (root.right != null) 
        {
            traverseRightBoundary(root.right);
        } 
        else 
        {
            traverseRightBoundary(root.left);
        }
        System.out.print(root.data + " ");
    }

    public static void boundaryTraversal(Node root) 
    {
        if (root == null) 
        {
            return;
        }

        System.out.print(root.data + " ");
        traverseLeftBoundary(root.left);
        traverseLeafNodes(root.left);
        traverseLeafNodes(root.right);
        traverseRightBoundary(root.right);
    }

    public static void main(String[] args) {
        BoundaryTraversal tree = new BoundaryTraversal();
        tree.root = tree.buildTree();
        System.out.println("Boundary Traversal:");
        boundaryTraversal(tree.root);
    }
}
