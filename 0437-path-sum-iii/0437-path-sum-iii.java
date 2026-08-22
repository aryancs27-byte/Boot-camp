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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        int count = pathFromNode(root,targetSum);
        count += pathSum(root.left,targetSum);
        count += pathSum(root.right,targetSum);
        return count;
    }

    private int pathFromNode(TreeNode root , long targetSum){
        if(root == null){
            return 0;
        }
        int count = 0;
        targetSum -= root.val;
        if(targetSum == 0){
            count++;
        }
        count += pathFromNode(root.left,targetSum);
        count += pathFromNode(root.right,targetSum);

        return count;
    }
}