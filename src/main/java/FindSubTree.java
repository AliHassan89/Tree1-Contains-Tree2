package main.java;

public class FindSubTree {

    public static void main (String[] args) {
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(7);
        root.left.left = new Node(9);
        root.left.right = new Node(10);
        root.right.left = new Node(11);
        root.right.right = new Node(12);
        root.left.left.left = new Node(13);
        root.left.left.right = new Node(14);
        root.left.right.left = new Node(15);
        root.left.right.right = new Node(16);
        root.right.left.left = new Node(17);
        root.right.left.right = new Node(18);
        root.right.right.left = new Node(19);
        root.right.right.right = new Node(20);

        Node root2 = new Node(9);
        root2.right = new Node(14);
        root2.left = new Node(13);

        //returns true
        System.out.println(isSubTree(root, root2));
    }

    private static boolean isSubTree(Node root1, Node root2) {

        if (root1 == null && root2 == null)
            return true;

        else if (root1 == null || root2 == null)
            return false;

        if (isIdentical(root1, root2))
            return true;

        return isSubTree(root1.left, root2) || isSubTree(root1.right, root2);
    }

    private static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;

        else if (root1 == null || root2 == null)
            return false;

        return root1.data == root2.data &&
                isIdentical(root1.left, root2.left) &&
                isIdentical(root1.right, root2.right);
    }



}
