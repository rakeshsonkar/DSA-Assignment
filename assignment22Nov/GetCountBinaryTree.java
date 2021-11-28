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
Public class GetCountBinaryTree{
	static int get_count(Node root){
	    if(root==null){
	        return 0;
	    }
	    else{
	        return 1+ get_count(root.left)+ get_count(root.right);
	    }
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		System.out.println(get_count(root));
	}
}