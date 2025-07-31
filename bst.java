
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class bst {

    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (root.data < key) {
            root.right = insert(root.right, key);
        } else if (root.data > key) {
            root.left = insert(root.left, key);
        }
        return root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 0, 2, 3, 8, 4, 6, 7, 5, 9, 1 };
        Node root = null;
        bst t = new bst();
        for (int i = 0; i < arr.length; i++) {
            root = t.insert(root, arr[i]);
        }
        t.inorder(root);
    }

}
