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
    public static List<Integer> ok = new ArrayList<>();
    public static void yep(TreeNode root){

        if(root!=null){
        if(root.left != null){
            yep(root.left);
        }
        ok.add(root.val);
        if(root.right != null){
            yep(root.right);
        }}
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ok.clear();
        yep(root);
        return ok;
    }
}