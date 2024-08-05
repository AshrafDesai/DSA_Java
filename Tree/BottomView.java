package Tree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
public class BottomView 
{
    static class Node 
    {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;
    Scanner sc = new Scanner(System.in);

    Node buildTree() {
        System.out.println("Enter the data (-1 for no node):");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node newNode = new Node(data);
        System.out.println("Enter the data to insert left of " + data + ":");
        newNode.left = buildTree();

        System.out.println("Enter the data to insert right of " + data + ":");
        newNode.right = buildTree();

        return newNode;
    }

    public static void bottomview(Node root) {
        if (root == null) 
        {
            return;
        }

        TreeMap<Integer, Integer> topNode = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair temp = q.poll();
            Node frontNode = temp.node;
            int hd = temp.hd;
            topNode.put(hd, frontNode.data);
            

            if (frontNode.left != null) {
                q.add(new Pair(frontNode.left, hd - 1));
            }
            if (frontNode.right != null) {
                q.add(new Pair(frontNode.right, hd + 1));
            }
        }

        for (int value : topNode.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BottomView tree = new BottomView();
        tree.root = tree.buildTree();
        System.out.println("Top view of the binary tree:");
        bottomview(tree.root);
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}

