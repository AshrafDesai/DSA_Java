package Tree;

import java.util.Scanner;

public class HeightofTree 
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
    Node root;
    Scanner sc = new Scanner(System.in);

    Node buildtree()
    {
        System.out.println("Enter the data:");
        int data = sc.nextInt();
        if(data==-1)
        {
            return null;
        }
        Node newNode = new Node(data);

        System.out.println("Enter the data to insert to left:" + data);
        newNode.left = buildtree();

        System.out.println("Enter the data to insert to right: " + data);
        newNode.right = buildtree();

        return newNode;
    }
    public static int height(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        return Math.max(left,right)+1;
    }   
    public static void main(String[] args) 
    {
        HeightofTree tree = new HeightofTree();
        tree.root = tree.buildtree();
        int treeHeight = height(tree.root);
        System.out.println("The height of a tree is :" + treeHeight);
    }
}