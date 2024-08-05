package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class LeftView 
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

    public static void solve(Node root, ArrayList<Integer> ans, int level) {
        if (root == null) 
        {
            return;
        }
        
        if (level == ans.size()) 
        {
            ans.add(root.data);
        }
        solve(root.left, ans, level + 1);
        solve(root.right, ans, level + 1);
    }

    public static ArrayList<Integer> leftview(Node root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, ans, 0);
        return ans;
    }

    public static void main(String[] args) 
    {
        LeftView tree = new LeftView();
        tree.root = tree.buildTree();
        ArrayList<Integer> leftViewResult = leftview(tree.root);
        System.out.println("Left view of the binary tree:");
        for (int value : leftViewResult) {
            System.out.print(value + " ");
        }
    }
}
