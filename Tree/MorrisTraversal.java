package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MorrisTraversal 
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

    public static void morrisTraversal(Node root) 
    {
        Node curr = root;
        Node pre;

        while (curr != null) 
        {
            if (curr.left == null) 
            {
                System.out.print(curr.data + " ");
                curr = curr.right;
            } 
            else 
            {
                pre = curr.left;
                while (pre.right != null && pre.right != curr) {
                    pre = pre.right;
                }

                if (pre.right == null) 
                {
                    pre.right = curr;
                    curr = curr.left;
                } 
                else 
                {
                    pre.right = null;
                    System.out.print(curr.data + " ");
                    curr = curr.right;
                }
            }
        }
    }

    public static Node buildTree(Scanner sc)
    {
        System.out.println("Enter the data for the nodes (-1 for null):");
        int data = sc.nextInt();
        
        if (data == -1) 
        {
            return null;
        }
        
        Node root = new Node(data);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) 
        {
            Node current = queue.poll();
            
            System.out.println("Enter left child of " + current.data + ":");
            data = sc.nextInt();
            if (data != -1) 
            {
                current.left = new Node(data);
                queue.add(current.left);
            }
            
            System.out.println("Enter right child of " + current.data + ":");
            data = sc.nextInt();
            if (data != -1)
            {
                current.right = new Node(data);
                queue.add(current.right);
            }
        }
        return root;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of nodes (for complete binary tree, or enter nodes in level-order):");
        
        Node root = buildTree(sc);
        
        System.out.println("Morris Traversal of the binary tree:");
        morrisTraversal(root);
        
        sc.close();
    }
}
