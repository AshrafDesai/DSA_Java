package Tree;

import java.util.Scanner;

public class CountLeafNode 
{

    static class Node 
    {
        int data;
        Node left;
        Node right;

        Node(int data) 
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

   
    public static int countLeafNodes(Node root) 
    {
        if (root == null) 
        {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
    public static Node buildTree(Scanner sc) 
    {
        System.out.println("Enter the data (-1 for no node):");
        int data = sc.nextInt();

        if (data == -1) 
        {
            return null;
        }

        Node newNode = new Node(data);

        System.out.println("Enter the data to insert left of " + data);
        newNode.left = buildTree(sc);

        System.out.println("Enter the data to insert right of " + data);
        newNode.right = buildTree(sc);

        return newNode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        CountLeafNode tree = new CountLeafNode();
        System.out.println("Build the binary tree:");
        Node root = tree.buildTree(sc);
        
        int leafCount = countLeafNodes(root);
        System.out.println("Number of leaf nodes: " + leafCount);
        
        sc.close();
    }
}
