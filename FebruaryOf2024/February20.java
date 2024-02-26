package FebruaryOf2024;

public class February20 {
    /*
     * https://leetcode.com/problems/same-tree/?envType=daily-question&envId=2024-02-26
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both of tree are null then its true
        if (p == null && q == null) return true;
        
        // if one of them is null but other one have a value or have different values then its false
        if (p == null || q == null || p.val != q.val) return false;
        
        // Check every subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}