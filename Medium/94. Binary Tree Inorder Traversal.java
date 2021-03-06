// Given a binary tree, return the inorder traversal of its nodes' values.
//
// For example:
// Given binary tree [1,null,2,3],
//    1
//     \
//      2
//     /
//    3
// return [1,3,2]

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
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> result = new LinkedList<Integer>();
      Stack<Integer> stack = new Stack<Integer>();
      while(root!=null || !stack.isEmpty()){
        while(root!=null){
          stack.add(root);
          root = root.left;
        }
        root = stack.pop();
        result.add(root.val);
        root = root.right;
      }
      return result;
    }
  }
