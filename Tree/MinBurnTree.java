package Tree;

import java.util.*;

public class MinBurnTree 
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

    Node createParentMapping(Node root, int target, Map<Node, Node> nodeToParent) {
        Node result = null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        nodeToParent.put(root, null);

        while (!q.isEmpty()) 
        {
            Node front = q.poll();

            if (front.data == target) 
            {
                result = front;
            }

            if (front.left != null) 
            {
                nodeToParent.put(front.left, front);
                q.add(front.left);
            }

            if (front.right != null) 
            {
                nodeToParent.put(front.right, front);
                q.add(front.right);
            }
        }
        return result;
    }

    void burnTree(Node targetNode, Map<Node, Node> nodeToParent, Set<Node> visited, Queue<Node> q, int[] time) {
        visited.add(targetNode);
        q.add(targetNode);
        time[0] = 0;

        while (!q.isEmpty()) 
        {
            int size = q.size();
            for (int i = 0; i < size; i++) 
            {
                Node node = q.poll();

                if (node.left != null && !visited.contains(node.left)) 
                {
                    visited.add(node.left);
                    q.add(node.left);
                }

                if (node.right != null && !visited.contains(node.right)) {
                    visited.add(node.right);
                    q.add(node.right);
                }

                Node parent = nodeToParent.get(node);
                if (parent != null && !visited.contains(parent)) 
                {
                    visited.add(parent);
                    q.add(parent);
                }
            }
            if (!q.isEmpty()) 
            { 
                time[0]++;
            }
        }
    }

    public static int minTime(Node root, int target) 
    {
        MinBurnTree m = new MinBurnTree();
        Map<Node, Node> nodeToParent = new HashMap<>();
        Node targetNode = m.createParentMapping(root, target, nodeToParent);

        if (targetNode == null) return -1;

        Queue<Node> q = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        int[] time = new int[1];

        m.burnTree(targetNode, nodeToParent, visited, q, time);

        return time[0];
    }

    public static void main(String[] args) 
    {
        MinBurnTree minBurnTree = new MinBurnTree();

        System.out.println("Build the tree:");
        Node root = minBurnTree.buildTree();

        System.out.println("Enter the target node value:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int result = minBurnTree.minTime(root, target);

        if (result == -1)
        {
            System.out.println("Target node not found in the tree.");
        } 
        else 
        {
            System.out.println("Minimum time to burn the tree: " + result);
        }

        sc.close();
    }
}
