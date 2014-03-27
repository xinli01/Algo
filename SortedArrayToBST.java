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
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0)
        {
            return null;
        }
        
        return sortedArrayToBST(num, 0, num.length-1);
    }
    
    public TreeNode sortedArrayToBST(int[] num, int startIndex, int endIndex) {
        // base case
        if (endIndex == startIndex)
        {
            return new TreeNode(num[startIndex]);
        }
        
        if (endIndex -1 == startIndex)
        {
            TreeNode child = sortedArrayToBST(num, startIndex, startIndex);
            TreeNode parent = new TreeNode(num[endIndex]);
            parent.left= child;
            parent.right = null;
            return parent;
        }
        
        // recursive
        int index = (startIndex + endIndex)/2;
        TreeNode leftChild = sortedArrayToBST(num, startIndex, index-1);
        TreeNode rightChild = sortedArrayToBST(num, index+1, endIndex);
        TreeNode parent1 = new TreeNode(num[index]);
        parent1.left= leftChild;
        parent1.right = rightChild;
        return parent1;
    }
}
