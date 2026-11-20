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

    public int ans = 0;
    public void sum(TreeNode root, char a){

        
        if(root.left != null) sum(root.left,'l');
        if(root.right !=null) sum(root.right,'r');

        if(root.left== null && root.right==null && a=='l'){
            ans+=root.val;
        }

        


    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        
        ans = 0;
        if (root!=null){
            sum(root, 'r');
        }

        return ans;
    }
}