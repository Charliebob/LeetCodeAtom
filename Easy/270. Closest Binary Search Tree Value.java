// Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
//
// Note:
// Given target value is a floating point.
// You are guaranteed to have only one unique value in the BST that is closest to the target.

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
    public int closestValue(TreeNode root, double target) {
      int closestVal = root.val;
      while(root!=null){
        closestVal = (Math.abs(target-root.val)<Math.abs(target-closestVal))?root.val:closestVal;
        if(closestVal==target) return closestVal;
        root = (root.val>target)?root.left: root.right;
      }
      return closestVal;
    }
  }
