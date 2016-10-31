// Find the sum of all left leaves in a given binary tree.
//
// Example:
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
//
// There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
      return helper(root, false);
    }
    private int helper(TreeNode root, boolean isLeft){
      if(root==null) return 0;
      if(root.left==null && root.right==null){
        if(isLeft) return root.val;
        return 0;
      }
      return helper(root.left, true) + helper(root.right, false); 
    }
  }
