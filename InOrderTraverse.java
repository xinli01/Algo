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
    
    public void Push(TreeNode n, Deque<TreeNode> stack)
    {
        while(n != null)
        {
            stack.push(n);
            n = n.left;
        }
    }
    
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if (root == null)
        {
            return result;
        }
        
        // init a stack
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        
        Push(root, stack);
        
        while (stack.peekFirst() != null)
        {
            TreeNode temp = stack.pop();
            result.add(temp.val);
            
            if (temp.right != null)
            {
                Push(temp.right, stack);
            }
        }
        
        return result;
    }
}
