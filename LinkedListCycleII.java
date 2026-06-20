public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null) return null;
        // HashSet<ListNode> set=new HashSet<>();
        // ListNode temp=head;
        // // set.add(temp);
        // while(temp!=null&&!set.contains(temp)){
        //     set.add(temp);
        //     temp=temp.next;
        // }
        // return temp;

        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            // if(fast==null||fast.next==null)return null;
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                ListNode temp=head;
                while(temp!=slow){
                    temp=temp.next;
                    slow=slow.next;
                }
                return temp;
            }
            
        }
        return null;
        // if(fast==null)return null;
        // while(fast!=slow){
        //     if(fast==null||fast.next==null)return null;
        //     fast=fast.next.next;
        //     slow=slow.next;
        // }
        // ListNode start=head;
        // while(start!=slow){
        //     start=start.next;
        //     slow=slow.next;
        // }
        // return start ;
    }
}
