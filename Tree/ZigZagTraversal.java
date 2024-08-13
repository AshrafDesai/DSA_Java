package Tree;

import java.util.*;

public class ZigZagTraversal
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

    Node buildTree() {
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

    public void zigzagTraversal(Node root) 
    {
        if (root == null) 
        {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) 
        {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) 
            {
                Node frontNode = q.poll();

                if (leftToRight) 
                {
                    level.add(frontNode.data);
                } 
                else 
                {
                    level.add(0, frontNode.data);
                }

                if (frontNode.left != null) 
                {
                    q.add(frontNode.left);
                }
                if (frontNode.right != null) 
                {
                    q.add(frontNode.right);
                }
            }

            for (int value : level) 
            {
                System.out.print(value + " ");
            }
            System.out.println();

            leftToRight = !leftToRight;
        }
    }

    public static void main(String[] args) {
        ZigZagTraversal tree = new ZigZagTraversal();
        tree.root = tree.buildTree();
        System.out.println("Zigzag Traversal:");
        tree.zigzagTraversal(tree.root);
    }
}
