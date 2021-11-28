public class LevelOfTraversal{
	static void levelTraversal(Node root) {
		int h = getHeight(root);
		
		for(int i=0;i<=h;i++) {
			PrintKthLevel(root, i);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			root.right.right = new Node(6);
			levelTraversal(root);

	}
}
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