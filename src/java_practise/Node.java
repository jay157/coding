package java_practise;


	
	
	// Node class for Binary Tree
	class Node {
	    int value;
	    Node left, right;

	    // Constructor
	    public Node(int item) {
	        value = item;
	        left = right = null;
	    }
	    
	    public static void main(String[] args) {
	        BinaryTree tree = new BinaryTree();

	        // Insert values
	        tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);

	        // Print tree traversals
	        System.out.println("In-order traversal:");
	        tree.inorder();
	        
	        System.out.println("\nPre-order traversal:");
	        tree.preorder();
	        
	        System.out.println("\nPost-order traversal:");
	        tree.postorder();
	    }
	}

	// BinaryTree class
	class BinaryTree {
	    Node root;

	    // Constructor
	    BinaryTree() {
	        root = null;
	    }

	    // Insert a new value in the tree
	    void insert(int value) {
	        root = insertRec(root, value);
	    }

	    // Recursive function to insert a new value
	    Node insertRec(Node root, int value) {
	        if (root == null) {
	            root = new Node(value);
	            return root;
	        }
	        if (value < root.value) {
	            root.left = insertRec(root.left, value);
	        } else if (value > root.value) {
	            root.right = insertRec(root.right, value);
	        }
	        return root;
	    }

	    // In-order traversal of the tree
	    void inorder() {
	        inorderRec(root);
	    }

	    // Recursive function for in-order traversal
	    void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.print(root.value + " ");
	            inorderRec(root.right);
	        }
	    }

	    // Pre-order traversal of the tree
	    void preorder() {
	        preorderRec(root);
	    }

	    // Recursive function for pre-order traversal
	    void preorderRec(Node root) {
	        if (root != null) {
	            System.out.print(root.value + " ");
	            preorderRec(root.left);
	            preorderRec(root.right);
	        }
	    }

	    // Post-order traversal of the tree
	    void postorder() {
	        postorderRec(root);
	    }

	    // Recursive function for post-order traversal
	    void postorderRec(Node root) {
	        if (root != null) {
	            postorderRec(root.left);
	            postorderRec(root.right);
	            System.out.print(root.value + " ");
	        }
	    }
	}
	



