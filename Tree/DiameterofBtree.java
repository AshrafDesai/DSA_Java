package Tree;

import java.util.Scanner;

public class DiameterofBtree {
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
    
    Node root;
    Scanner sc = new Scanner(System.in);

    Node buildtree()
    {
        System.out.println("Enter the data:");
        int data = sc.nextInt();
        if(data == -1)
        {
            return null;
        }
        Node newNode = new Node(data);

        System.out.println("Enter the data to insert to left of " + data + ":");
        newNode.left = buildtree();

        System.out.println("Enter the data to insert to right of " + data + ":");
        newNode.right = buildtree();

        return newNode;
    }
    
    public static int height(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        return Math.max(left, right) + 1;
    }   
    
    public static int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int op1 = diameter(root.left);
        int op2 = diameter(root.right);
        int op3 = height(root.left) + height(root.right) + 1; 

        return Math.max(op3, Math.max(op1, op2)); 
    }

    public static void main(String[] args)
    {
        DiameterofBtree tree = new DiameterofBtree();
        tree.root = tree.buildtree();

        int diameter = diameter(tree.root);
        System.out.println("The diameter of the tree is: " + diameter);
    }
}
