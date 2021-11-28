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
    public TreeNode sortedArrayToBST(int[] nums) {
    int start = 0;
        int end = nums.length-1;
        
        return creatBST(nums, start, end);
    }
    static TreeNode creatBST(int[] nums, int start, int end)
    {
        if(start > end) return null;
        
        int mid = start + (end - start)/2;
        
        TreeNode head = new TreeNode(nums[mid]);
        
        head.left = creatBST(nums, start, mid-1);
        head.right = creatBST(nums, mid+1, end);
        
        return head;
    }
}