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
    public int findBottomLeftValue(TreeNode root) {
        int ans=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int l=q.size();
            for(int i=0;i<l;i++)
            {
                TreeNode t=q.poll();
                if(t.left!=null)q.add(t.left);
                if(t.right!=null)q.add(t.right);
                if(t.left==null && t.right == null && i==0) ans=t.val;
            }
        }
    return ans;
    }
}