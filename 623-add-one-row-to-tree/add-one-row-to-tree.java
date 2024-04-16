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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        Queue<TreeNode> q=new LinkedList<>();
         if(depth==1){
            TreeNode n=new TreeNode(val);
            n.left=root;
            return n;
        }
        q.add(root);
        int i=1;
       
        while(!q.isEmpty())
        {
            int len=q.size();
            if(i==depth-1)
            {
                for(int j=0;j<len;j++)
                {
                    TreeNode temp=q.poll();
                    TreeNode left=temp.left;
                    TreeNode right=temp.right;
                    TreeNode nl=new TreeNode(val);
                    TreeNode nr=new TreeNode(val);
                    nl.left=left;
                    nr.right=right;
                    temp.left=nl;
                    temp.right=nr;
                }

            }
           else{ 
            for(int j=0;j<len;j++)
            {
                TreeNode temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }}
            i++;
        }
        return root;
    }
}