
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class searchbst {

    public Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
        } else if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        } else if (key == root.data) {
            return true;
        } else if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    public static void main(String[] args) {
        searchbst s = new searchbst();
        int arr[] = { 0, 2, 3, 8, 4, 6, 7, 5, 9, 1 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = s.insert(root, arr[i]);
        }
        System.out.println(s.search(root, -1));

    }
}
