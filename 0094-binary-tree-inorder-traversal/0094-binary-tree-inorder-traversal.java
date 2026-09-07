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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if(root == null)return ans;

        Inorder(root,ans);

        return ans;
    }

    public void Inorder(TreeNode node,ArrayList<Integer> ls){
        if(node.left != null){
            Inorder(node.left,ls);
        }
        ls.add(node.val);
        if(node.right != null){
            Inorder(node.right,ls);
        }
    }
}