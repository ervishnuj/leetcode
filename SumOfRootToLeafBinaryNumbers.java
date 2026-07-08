import java.util.ArrayList;

public class SumOfRootToLeafBinaryNumbers {
    int res = 0;

    public int sumRootToLeaf(TreeNode root) {
        travel(root, new ArrayList<>());
        return res;
    }

    public void travel(TreeNode root, ArrayList<Integer> al) {
        if (root == null) {
            return;
        }
        // val+=root.val*2;
        al.add(root.val);
        if (root.left == null && root.right == null) {

            int val = 0;
            int ans = 0;

            for (int i = al.size() - 1; i >= 0; i--) {
                ans += (1 << val++) * al.get(i);
            }

            res += ans;
        }

        travel(root.left, al);
        travel(root.right, al);

        // Backtracking
        al.remove(al.size() - 1);
    }
}
