/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void NLR(TreeNode root) {
        if(root.left!=null){
            NLR(root.left);
        }
        if(root.right!=null){
            NLR(root.right);
        }
        ls.add(root.val);
    }
    List<Integer> ls = new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)return ls;
        NLR(root);
        return ls;
    }
}