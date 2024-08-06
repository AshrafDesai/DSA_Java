package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class KSumPaths 
{
    static class Node 
    {
        int data;
        Node left;
        Node right;

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

    public static void solve(Node root, int k, int[] count, ArrayList<Integer> path) {
        if (root == null) 
        {
            return;
        }

        path.add(root.data);

        solve(root.left, k, count, path);
        solve(root.right, k, count, path);

        int sum = 0;
        for (int i = path.size() - 1; i >= 0; i--) 
        {
            sum = sum + path.get(i);
            if (sum == k) 
            {
                count[0]++;
            }
        }

        path.remove(path.size() - 1);
    }

    public static int sumk(Node root, int k) 
    {
        ArrayList<Integer> path = new ArrayList<>();
        int[] count = {0};
        solve(root, k, count, path);
        return count[0];
    }

    public static void main(String[] args) {
        KSumPaths tree = new KSumPaths();
        tree.root = tree.buildTree();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        System.out.println("Number of paths with sum k: " + sumk(tree.root, k));
        sc.close();
    }
}
