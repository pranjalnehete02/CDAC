package binaryTree;

public class BinaryTree {
	static int count = 0;
	class BTNode {
		int data;
		BTNode leftChild;
		BTNode rightChild;
	}
	
	private BTNode root;
	
	public BinaryTree() {
		root = null;
	}

	public void createTree01() {
		BTNode n1 = new BTNode();
		BTNode n2 = new BTNode();
		BTNode n3 = new BTNode();
		BTNode n4 = new BTNode();
		
		n1.data = 5;
		n1.leftChild = n2;
		n1.rightChild = n3;
		
		n2.data = 10;
		n2.leftChild = n4;
		n2.rightChild = null;
		
		n3.data = 6;
		n3.leftChild = null;
		n3.rightChild = null;
		
		n4.data = 8;
		n4.leftChild = null;
		n4.rightChild = null;
		
		root = n1;
	}

	private void printUsingInorder(BTNode root) {
		if (root == null) {
			return;
		}
		
		if (root.leftChild != null) {
			printUsingInorder(root.leftChild);
		}

		System.out.print(root.data + " ");

		if (root.rightChild != null) {
			printUsingInorder(root.rightChild);
		}
	}




	private void printUsingPreOrder(BTNode root){
		if(root == null){
			return;
		}
		System.out.println( root.data + "");

		if(root.leftChild != null) {
			printUsingPreOrder(root.leftChild);
		}

		if(root.rightChild != null){
			printUsingPreOrder(root.rightChild);
		}
	}
	


	private void printUsingPostOrder(BTNode root){
		if(root == null){
			return;
		}
		
		if(root.leftChild != null) {
			printUsingPreOrder(root.leftChild);
		}

		if(root.rightChild != null){
			printUsingPreOrder(root.rightChild);
		}

		System.out.println( root.data + "");

	}

	 private int countNodes(BTNode root){
	 	if(root == null){
	 		return 1;
		
	 	}
		 	return 1 + countNodes(root.leftChild) + countNodes(root.rightChild);
	 }
	 
	 private int countleaf(BTNode root){
		 	if(root == null){
		 		return 0;
		 	}
		 	if((root.leftChild == null) && (root.rightChild == null)) {
		 		count++;
		 	}
		    return countleaf(root.leftChild) + countleaf(root.rightChild);
		 }
//	 private int countNodewithValues(BTNode root) {
//		 if(root == null) {
//			 return 0;
//		 }
//		 
//		 if(root.leftChild.data == root.rightChild.data) {
//			 return 1;
//		 }
//		 return countNodewithValues(root.leftChild.data) + countNodewithValues(root.rightChild.data);
//		 
//	 }
		 
	 public void countleaf() {
		 int totalCount = countleaf(root);
		 System.out.println(totalCount);
	 }
	 public void countNodes() {
		 int totalCount = countNodes(root);
		 System.out.println(totalCount);
	 }
		 
	


	public void printUsingInorder() {
		printUsingInorder(root);
		System.out.println("");
	}

	public void  printUsingPreOrder(){
		printUsingPreOrder(root);
		System.out.println("");
	}

	public void printUsingPostOrder(){
		printUsingPostOrder(root);
		System.out.println("");
	}
	
	
}

