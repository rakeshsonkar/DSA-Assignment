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
    private List<Integer> leaves1;
        private List<Integer> leaves2;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        this.leaves1 = new ArrayList<>();
            this.leaves2 = new ArrayList<>();
            dfs(root1, leaves1);
            dfs(root2, leaves2);
            if(leaves1.size() != leaves2.size()) return false;
            for(int i = 0; i < leaves1.size(); i++){
                if(leaves1.get(i) != leaves2.get(i)) return false;
            }
            return true;
    }
    private void dfs(TreeNode node, List<Integer> list){
            if(node.left == null && node.right == null){
                list.add(node.val);
                return;
            }
            if(node.left != null) dfs(node.left, list);
            if(node.right != null) dfs(node.right, list);
        }
}