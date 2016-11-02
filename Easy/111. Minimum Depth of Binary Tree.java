// Given a binary tree, find its minimum depth.
//
// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

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
    public int minDepth(TreeNode root) {
      if(root==null) return 0;
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      queue.add(root);
      int depth = 1;
      while(!queue.isEmpty()){
        int size = queue.size();
        while(size-->0){
          TreeNode node = queue.poll();
          if(node.left==null && node.right==null) return depth;
          if(node.left!=null){
            queue.add(node.left);
          }
          if(node.rigth!=null){
            queue.add(node.right);
          }
        }
        depth++;
      }
      return depth;
    }
  }
