// Given a binary tree, return the preorder traversal of its nodes' values.
//
// For example:
// Given binary tree {1,#,2,3},
//    1
//     \
//      2
//     /
//    3
// return [1,2,3].

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
    public List<Integer> preorderTraversal(TreeNode root){
      List<Integer> result =new ArrayList<Integer>();
      Stack<TreeNode> stack = new Stack<TreeNode>();
      while(root!=null){
        result.add(root.val);
        if(root.right!=null) stack.push(root.right);
        root = root.left;
        if(root==null && !stack.isEmpty()) root= stack.pop();
      }
      return result;
    }
  }
