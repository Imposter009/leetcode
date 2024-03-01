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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            TreeNode prevNode = null;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.poll();
                if (level % 2 == 0) { //even-level
                    if (currNode.val % 2 == 0) {
                        return false;
                    }
                    if (prevNode != null && prevNode.val >= currNode.val) {
                        return false;
                    }
                }
                else { //odd-level
                    if (currNode.val % 2 == 1) {
                        return false;
                    }
                    if (prevNode != null && prevNode.val <= currNode.val) {
                        return false;
                    }
                }
                prevNode = currNode;
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
            level++;
        }
        return true;
    }
}

--------------------------------------------------------------------------------------------------------------
    // my code:
    class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root.val%2==0) return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int lvl=0;
        while(!q.isEmpty())
        {
            int l=q.size();
            List<Integer> ll=new ArrayList<>();
            for(int i=0;i<l;i++)
            {
                TreeNode t=q.poll();
                if(t.left!=null){
                    q.add(t.left);
                    ll.add(t.left.val);
                }
                if(t.right!=null){
                    q.add(t.right);
                    ll.add(t.right.val);
                }
            }
            lvl=lvl+1;
           for(int j=0;j<ll.size();j++)
            {
                //even
                if(lvl%2==0){
                    if(ll.get(j)%2==0) return false;
                    if(j+1<ll.size()) if(ll.get(j)>=ll.get(j+1)) return false;
                }
                //odd
                if(lvl%2!=0){
                    if(ll.get(j)%2!=0 && ll.get(j+1)%2!=0) return false;
                     if(j+1<ll.size()) if(ll.get(j)<=ll.get(j+1)) return false;
                }
            }
        }
        return true;
    }
}
