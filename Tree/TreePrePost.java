package Tree;

import java.util.HashMap;
import java.util.Scanner;
public class TreePrePost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();

        int[] inorder = new int[n];
        int[] postorder = new int[n];

        System.out.println("Enter the Inorder traversal:");
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }

        System.out.println("Enter the Postorder traversal:");
        for (int i = 0; i < n; i++) {
            postorder[i] = sc.nextInt();
        }

        Solution ob = new Solution();
        Solution.Node root = ob.buildTree(inorder, postorder, n);

        System.out.println("Preorder traversal of the constructed tree:");
        preorderTraversal(root);

        sc.close();
    }

    public static void preorderTraversal(Solution.Node node) 
    {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
}

class Solution {
    private HashMap<Integer, Integer> inOrderMap;
    private int postIndex;

    public Solution.Node buildTree(int[] inorder, int[] postorder, int n) {
        inOrderMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            inOrderMap.put(inorder[i], i);
        }

        postIndex = n - 1;

        return buildTreeHelper(inorder, postorder, 0, n - 1);
    }

    private Solution.Node buildTreeHelper(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        int rootValue = postorder[postIndex--];
        Solution.Node node = new Solution.Node(rootValue);

        int inIndex = inOrderMap.get(rootValue);

        node.right = buildTreeHelper(inorder, postorder, inIndex + 1, inEnd);
        node.left = buildTreeHelper(inorder, postorder, inStart, inIndex - 1);

        return node;
    }

    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
