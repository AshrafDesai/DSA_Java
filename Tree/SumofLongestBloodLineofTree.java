package Tree;

import java.util.Scanner;

public class SumofLongestBloodLineofTree 
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

    public static void solve(Node root, int sum, int[] maxSum, int len, int[] maxlen) {
        if (root == null) 
        {
            if (len > maxlen[0]) 
            {
                maxlen[0] = len;
                maxSum[0] = sum;
            } 
            else if (len == maxlen[0]) 
            {
                maxSum[0] = Math.max(sum, maxSum[0]);
            }
            return;
        }

        sum = sum + root.data;
        solve(root.left, sum, maxSum, len + 1, maxlen);
        solve(root.right, sum, maxSum, len + 1, maxlen);
    }

    public static int sumoflongroottoleafpath(Node root) 
    {
        int[] maxlen = {0};
        int[] maxSum = {Integer.MIN_VALUE};
        solve(root, 0, maxSum, 0, maxlen);
        return maxSum[0];
    }

    public static void main(String[] args) 
    {
        SumofLongestBloodLineofTree tree = new SumofLongestBloodLineofTree();
        tree.root = tree.buildTree();
        int sum = sumoflongroottoleafpath(tree.root);
        System.out.println("Sum of the longest bloodline from root to leaf: " + sum);
    }
}
