// Class representing a node in the binary tree
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// Class representing the binary tree
class BinaryTree {
    Node root;

    // Constructor to initialize the root
    BinaryTree() {
        root = null;
    }

    // Method to insert a new node
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive method to insert a new node
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    // Method for inorder traversal
    void inorder() {
        inorderRec(root);
    }

    // Recursive method for inorder traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Main method to test the binary tree
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserting nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Printing inorder traversal
        System.out.println("Inorder traversal:");
        tree.inorder();
    }
}
