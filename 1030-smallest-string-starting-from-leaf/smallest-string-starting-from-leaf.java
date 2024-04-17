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
     String result = "";

    void solve(TreeNode root, String curr) {
        if (root == null) {
            return;
        }

        curr = (char) (root.val + 'a') + curr;

        if (root.left == null && root.right == null) {
            if (result.equals("") || result.compareTo(curr) > 0) {
                result = curr;
            }
            return;
        }

        solve(root.left, curr);
        solve(root.right, curr);
    }

    public String smallestFromLeaf(TreeNode root) {
        solve(root, "");
        return result;
    }
}


-------------------------------------
class Solution {
    String res="";
    public String ans(TreeNode node, String str)
    {
        if(node==null) return str;
        String curr=(char) (node.val + 'a')+""+ str;
        if(node.left==null && node.right==null) return curr;
        String left=ans(node.left,curr);
        String right=ans(node.right,curr);
       
        if(left.compareTo(right)<0)
        {
             if(left.compareTo(res)<0 || res.equals(""))
            res=left;
        }
      if(right.compareTo(left)<0 )
        {
            if( right.compareTo(res)<0 || res.equals(""))
            res=right;
        }

      return res;
    }
    public String smallestFromLeaf(TreeNode root) {
       return ans(root,"");
    }
}
// note: error came for : 0 null 1
