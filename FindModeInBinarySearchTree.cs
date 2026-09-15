public class FindModeInBinarySearchTree {
    private List<int> result=new List<int>();
    private int count,modeCount,preValue;
    public int[] FindMode(TreeNode root) {
        InOrder(root);
        return result.ToArray();
    }
    void InOrder(TreeNode root){
        if(root==null)return;
        InOrder(root.left);
        if(preValue!=(int)root.val)count=1;
        else count++;
        if(count>modeCount){
            result.Clear();
            result.Add(root.val);
            modeCount=count;
        }else if(count==modeCount){
            result.Add(root.val);
        }
        preValue=root.val;
        InOrder(root.right);
    }
}
