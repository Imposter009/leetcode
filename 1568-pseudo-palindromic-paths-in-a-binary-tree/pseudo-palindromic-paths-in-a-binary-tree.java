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
    private int result = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        Map<Integer,Integer> temp=new HashMap<Integer,Integer>();
        solve(root, temp);
        return result;
    }

    private void solve(TreeNode root, Map<Integer,Integer> temp) {
        if (root != null) {
            temp.merge(root.val,1,Integer::sum);

            if (root.left == null && root.right == null) {
                int oddFreq = 0;
                for (int i = 1; i <= 9; i++) {
                    if(temp.containsKey(i))if (temp.get(i) % 2 != 0) {
                        oddFreq++;
                    }
                }

                result += oddFreq <= 1 ? 1 : 0;
            }

            solve(root.left, temp);
            solve(root.right, temp);

            temp.put(root.val,temp.get(root.val)-1);
        }
    }
}