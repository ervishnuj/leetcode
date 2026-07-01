public class UnivaluedBinaryTree {
    private int val=-1;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)return true;
        if(val==-1)val=root.val;
        if(root.val!=val)return false;
        return isUnivalTree(root.left)&&isUnivalTree(root.right);
        // return inorder(root,root.val);
    }
}

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
