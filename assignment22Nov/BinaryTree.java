package assignment22Nov;
class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}
public class BinaryTree{
	static int levelSoFar=0;
	
	public static void preorder(Node root) {
		if(root==null) return;
		
		System.out.print(root.key+",");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root) {
		if(root==null) return;
		
		inorder(root.left);
		System.out.print(root.key+",");
		inorder(root.right);
		
	}
	
	public static void postOrder(Node root) {
		if(root==null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key+",");
		
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		preorder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		inorder(root);
		
	}
}