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
class SumOfNodesWithEven-ValuedGrandparent {
    public int sumEvenGrandparent(TreeNode root) {
        int result=0;
        if(root==null||(root.left==null&&root.right==null))return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();

            if(temp.left != null){
                queue.add(temp.left);

                if(temp.val % 2 == 0){

                    if(temp.left.left != null)
                        result += temp.left.left.val;

                    if(temp.left.right != null)
                        result += temp.left.right.val;
                }
            }

            if(temp.right != null){
                queue.add(temp.right);

                if(temp.val % 2 == 0){

                    if(temp.right.left != null)
                        result += temp.right.left.val;

                    if(temp.right.right != null)
                        result += temp.right.right.val;
                }
            }
            // TreeNode temp=queue.poll();
            
            // if(root.left!=null&&(root.left.left!=null||root.left.right!=null)){
            //     queue.add(root.left);
            //     if(root.val%2==0){
            //     if(root.left.left!=null){
            //         result+=root.left.left.val;
            //     }else if(root.left.right!=null){
            //         result+=root.left.right.val;
            //     }}
            // }else if(root.right!=null&&(root.right.left!=null||root.right.right!=null)){
            //     queue.add(root.right);
            //     if(root.val%2==0){
            //     if(root.right.left!=null){
            //         result+=root.right.left.val;
            //     }else if(root.right.right!=null){
            //         result+=root.right.right.val;
            //     }
            // }
            // }
        }

        return result;
    }
}
