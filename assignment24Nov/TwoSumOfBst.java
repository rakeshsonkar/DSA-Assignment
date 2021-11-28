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
     private Set<Integer> set;
		private int target;
    public boolean findTarget(TreeNode root, int k) {
			if(root == null) return false;
			this.set = new HashSet<>();
			this.target = k;
			return dfs(root);
		}
		private boolean dfs(TreeNode node){
			if(node == null) return false;
			if(set.contains(this.target - node.val)) return true;
			set.add(node.val);
			return dfs(node.left) || dfs(node.right);
		}
        
}