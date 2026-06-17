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
class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head==null)return head;
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            System.out.println("val: "+temp.val);
            if(x>temp.val){
            al.add(temp.val);
            System.out.println("small number: "+temp.val);
            if(prev==null){
                head=temp.next;
                // prev.next=temp.next;
                temp=head;
                // prev=head;
                continue;
                
            }else{
                
                prev.next=temp.next;
                temp=prev.next;
            }
            }else{
                prev=temp;
                System.out.println("greatest number: "+temp.val);
                temp=temp.next;
            }


        }
        temp=new ListNode(99);
        prev=temp;
        for(Integer i: al){
            prev.next=new ListNode(i);
            prev=prev.next;
        }
        prev.next=head;
        return temp.next;
    }
}
