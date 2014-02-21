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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        // base case
        if (p == null && q == null)
        {
            return true;
        }
            
        if ((p == null && q!=null) || (p!=null && q==null))
        {
            return false;
        }
        
        if (p.val != q.val)
        {
            return false;
        }
        
        if (p.left == null && p.right == null && q.left == null && q.right == null)
        {
            return true;
        }
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
