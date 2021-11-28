/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
   if(root == null) return false;
			return dfs(root, 0, targetSum);
		}
		private boolean dfs(TreeNode node, int cur, int sum){
			if(node.left == null && node.right == null){
				return cur + node.val == sum;
			}else{
				if(node.left != null && dfs(node.left, cur + node.val, sum))   return true;
				if(node.right != null && dfs(node.right, cur + node.val, sum))  return true;
				return false;
			}
		}
}