package Tree;
import java.util.Scanner;

public class TreeInPre {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int preIndex = 0;

    public static Node buildTree(int[] in, int[] pre, int inStart, int inEnd) {
        if (inStart > inEnd) 
        {
            return null;
        }

        int current = pre[preIndex++];
        Node node = new Node(current);

        if (inStart == inEnd) 
        {
            return node;
        }

        int inIndex = findPosition(in, inStart, inEnd, current);

        node.left = buildTree(in, pre, inStart, inIndex - 1);
        node.right = buildTree(in, pre, inIndex + 1, inEnd);

        return node;
    }

    public static int findPosition(int[] in, int start, int end, int element) {
        for (int i = start; i <= end; i++) 
        {
            if (in[i] == element) 
            {
                return i;
            }
        }
        return -1; 
    }

    public static void postOrder(Node node) 
    {
        
        if (node == null)
        {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();

        int[] in = new int[n];
        int[] pre = new int[n];

        System.out.println("Enter the Inorder traversal:");
        for (int i = 0; i < n; i++) 
        {
            in[i] = sc.nextInt();
        }

        System.out.println("Enter the Preorder traversal:");
        for (int i = 0; i < n; i++) 
        {
            pre[i] = sc.nextInt();
        }

        Node root = buildTree(in, pre, 0, n - 1);

        System.out.println("Postorder traversal of the constructed tree:");
        postOrder(root);
        sc.close();
    }
}
