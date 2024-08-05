package Tree;

import java.util.*;

public class VerticalTraversal 
{
    static class Node {
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

    public static void verticalOrder(Node root) {
        if (root == null) {
            return;
        }

        TreeMap<Integer, ArrayList<Integer>> nodes = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair temp = q.poll();
            Node frontNode = temp.node;
            int hd = temp.hd;

            nodes.putIfAbsent(hd, new ArrayList<>());
            nodes.get(hd).add(frontNode.data);

            if (frontNode.left != null) {
                q.add(new Pair(frontNode.left, hd - 1));
            }

            if (frontNode.right != null) {
                q.add(new Pair(frontNode.right, hd + 1));
            }
        }

        for (ArrayList<Integer> vertical : nodes.values()) {
            for (int value : vertical) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        VerticalTraversal tree = new VerticalTraversal();
        tree.root = tree.buildTree();
        System.out.println("Vertical Order Traversal:");
        verticalOrder(tree.root);
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
