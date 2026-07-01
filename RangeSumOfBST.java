public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)return 0;
        int val=0;
        if(root.val>=low&&root.val<=high)val=root.val;
        // int val=root.val;
        val+=rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
        return val;
    }
}

 // Definition for a binary tree node.
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 