// Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its bottom-up level order traversal as:
// [
//   [15,7],
//   [9,20],
//   [3]
// ]

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      if(root==null) return result;
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      queue.add(root);
      while(!queue.isEmpty()){
        int size = queue.size();
        while(size-->=0){
          List<Integer> row = new ArrayList<Integer>();
          TreeNode temp = queue.poll();
          if(temp.left!=null){
            queue.add(temp.left);
          }
          if(temp.right!=null){
            queue.add(temp.right);
          }
          row.add(temp.val);
        }
        result.add(0, row);
      }
      return result;
    }
  }
