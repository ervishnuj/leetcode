public class DoubleANumberRepresentedAsALinkedList {
     public ListNode doubleIt(ListNode head) {
        ListNode rev=null;
        ListNode temp=head;
        while(temp!=null){
            if(rev==null){
                rev=temp;
                temp=temp.next;
                rev.next=null;
            }else{
                ListNode dummy=rev;
                rev=temp;
                temp=temp.next;
                rev.next=dummy;
            }
            System.out.println(rev.val);
        }
        ListNode dummy=rev;
        int bal=0;
        temp=null;
        while(dummy!=null){
            bal+=dummy.val*2;
            ListNode node=new ListNode(bal%10,temp);
            temp=node;
            dummy=dummy.next;
            bal/=10;
        }
        if(bal>0){
            ListNode node=new ListNode(bal%10,temp);
            temp=node;
            bal/=10;
        }
        return temp;
    }
}


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}