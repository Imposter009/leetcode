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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left==null && root.right==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        boolean nl=false;
        while(!q.isEmpty())
        {         
            TreeNode temp=q.poll();
            if(temp.left!=null)
            {
                if(temp.left.left==null && temp.left.right==null)
                ans+=temp.left.val;
               else q.add(temp.left);
            }
             if (temp.right != null)
        q.add(temp.right);
        }
return ans;
    }
}