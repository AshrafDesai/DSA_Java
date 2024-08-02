package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

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

        System.out.println("Enter the data to insert left of " + data);
        newNode.left = buildTree();

        System.out.println("Enter the data to insert right of " + data);
        newNode.right = buildTree();

        return newNode;
    }

    void printTree(Node node, String prefix) 
    {
        if (node == null) 
        {
            return;
        }
    
        System.out.println(prefix + node.data);
    
        if (node.left != null || node.right != null) 
        {

            printTree(node.left, prefix + "├── ");
            printTree(node.right, prefix + "└── ");
        }
    }
    
    void display() {
        printTree(root, "");
    }

    void levelOrderTraversal(Node root) 
    {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();  
            for (int i = 0; i < levelSize; i++) 
            {
                Node tempNode = q.poll();
                System.out.print(tempNode.data + " ");

                if (tempNode.left != null) 
                {
                    q.add(tempNode.left);
                }

                if (tempNode.right != null) 
                {
                    q.add(tempNode.right);
                }
            }
            System.out.println();  
        }
        
    }
    void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.buildTree();
        System.out.println("Tree Structure:");
        tree.display();

        System.out.println("\nLevel Order Traversal of the Tree:");
        tree.levelOrderTraversal(tree.root);

        System.out.print("\nInorder Traversal of the Tree:");
        tree.inorder(tree.root);

        System.out.print("\nPreorder Traversal of the Tree:");
        tree.preorder(tree.root);

        System.out.print("\nPostorder Traversal of the Tree:");
        tree.postorder(tree.root);
    }
}
