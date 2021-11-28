
package assignment23Nov;
public class PrintKthLevel{
static void PrintKthLevel(Node root, int k) {
		if(root==null) return;
		
		if(k==0) {
			System.out.print(root.key+" ");
		}
		PrintKthLevel(root.left, k-1);
		PrintKthLevel(root.right, k-1);
	}
	public static void main(String[] args) {
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			root.right.right = new Node(6);
			PrintKthLevel(root, 2);
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