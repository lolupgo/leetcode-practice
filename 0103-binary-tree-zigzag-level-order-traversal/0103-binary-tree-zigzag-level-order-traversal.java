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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List <List<Integer>> ans = new ArrayList<>();
        if(root == null)return ans;

        int width = 1;
        TreeNode p = root;
        int layer = 0;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.offer(p);

        while(!Q.isEmpty()){
            ArrayList<Integer> ls = new ArrayList<>();
            for(int i = 1;i<=width;i++){
                p = Q.poll();
                if(p.left != null){
                    Q.offer(p.left);
                }
                if(p.right != null){    
                    Q.offer(p.right);
                }
                ls.add(p.val);
            }
            if(layer%2 == 0){
                ans.add(ls);
            }
            else{
                Collections.reverse(ls);
                ans.add(ls);
            }
            layer++;
            width = Q.size();
        } 

        return ans;
    }
}