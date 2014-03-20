/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if (root == null)
        {
            return result;
        }
        
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        
        TreeNode current = root;
        stack.push(root);
        
        while(!stack.isEmpty())
        {
            // pop the current element
            TreeNode popOut = stack.pop();
            result.add(popOut.val);
                
            if (popOut.right != null)
            {
                stack.push(popOut.right);
            }
                
            if (popOut.left != null)
            {
                stack.push(popOut.left);
            }
        }
        
        return result;
    }
}
