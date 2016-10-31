// Given a binary tree, find its maximum depth.
//
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

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
    public int maxDepth(TreeNode root) {
      if(root=null) return 0;
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      queue.add(root);
      int count = 0;
      while(!queue.isEmpty()){
        int size = queue.size();
        while(size-->0){
          TreeNode temp = queue.poll();
          if(temp.left!=null){
            queue.add(temp.left);
          }
          if(temp.right!=null){
            queue.add(temp.right);
          }
        }
        count++;
      }
      return count;
    }
  }
