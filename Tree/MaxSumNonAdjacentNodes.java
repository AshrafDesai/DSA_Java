package Tree;

import java.util.HashMap;
import java.util.Scanner;

public class MaxSumNonAdjacentNodes {
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

    private static int getMaxSumUtil(Node root, HashMap<Node, Integer> memo) {
        if (root == null) {
            return 0;
        }

        if (memo.containsKey(root)) {
            return memo.get(root);
        }

        int sumWithRoot = root.data;
        if (root.left != null) {
            sumWithRoot += getMaxSumUtil(root.left.left, memo) + getMaxSumUtil(root.left.right, memo);
        }
        if (root.right != null) {
            sumWithRoot += getMaxSumUtil(root.right.left, memo) + getMaxSumUtil(root.right.right, memo);
        }

        int sumWithoutRoot = getMaxSumUtil(root.left, memo) + getMaxSumUtil(root.right, memo);

        int result = Math.max(sumWithRoot, sumWithoutRoot);
        memo.put(root, result);

        return result;
    }

    public static int getMaxSum(Node root) {
        HashMap<Node, Integer> memo = new HashMap<>();
        return getMaxSumUtil(root, memo);
    }

    public static void main(String[] args) {
        MaxSumNonAdjacentNodes tree = new MaxSumNonAdjacentNodes();
        tree.root = tree.buildTree();
        System.out.println("Max sum of non-adjacent nodes: " + getMaxSum(tree.root));
    }
}
