import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    // List<List<Integer>> ans;

    // public List<List<Integer>> levelOrderBottom(TreeNode root) {
    // ans = new ArrayList<>();
    // if (root == null)
    // return ans;

    // TreeNode node = root;
    // Queue<TreeNode> queue = new LinkedList<>();
    // queue.add(node);

    // while (!queue.isEmpty()) {

    // Queue<TreeNode> temp = new LinkedList();
    // List<Integer> list = new ArrayList<>();
    // while (!queue.isEmpty()) {
    // TreeNode treeNode = queue.poll();
    // System.out.println(treeNode.val);
    // // List<Integer> list=new ArrayList<>();
    // list.add(treeNode.val);
    // if (treeNode.left != null)
    // temp.add(treeNode.left);
    // if (treeNode.right != null)
    // temp.add(treeNode.right);
    // }
    // queue = temp;
    // ans.add(0, list);
    // }
    // return ans;
    // }
    public List<List<Integer>> levelOrderBottom(TreeNode node) {
        List<List<Integer>> ans = new ArrayList<>();
        if (node == null)
            return ans;
        // TreeNode node=root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {

            // Queue<TreeNode> temp=new LinkedList();
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            // while(!queue.isEmpty()){
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                // System.out.println(treeNode.val);
                // List<Integer> list=new ArrayList<>();
                list.add(treeNode.val);
                if (treeNode.left != null)
                    queue.offer(treeNode.left);
                if (treeNode.right != null)
                    queue.offer(treeNode.right);
            }
            // queue=temp;
            ans.addFirst(list);
        }
        return ans;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
