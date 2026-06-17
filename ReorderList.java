/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReorderList {
    public void reorderList(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        for(int i=al.size()-1;i>al.size()/2;i--){
            ListNode newNode=new ListNode(al.get(i));
            newNode.next=temp.next;
            temp.next=newNode;
            temp=newNode.next;
        }
        if(al.size()%2==0)
        temp.next.next=null;
        else temp.next=null;
        // return head;

    }
}
