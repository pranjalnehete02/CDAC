package binaryTree;

public class BinaryTreeTester {


		public static void testInorder() {
			BinaryTree bt01 = new BinaryTree();
			
			bt01.createTree01();
			bt01.printUsingInorder();
		}

		public static void main(String[] args) {
			BinaryTree btbt = new BinaryTree();
			System.out.println("Hello");
			btbt.createTree01();
			btbt.countleaf();
			btbt.countNodes();
			testInorder();
		}

	}

