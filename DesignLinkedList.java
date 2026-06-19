public class DesignLinkedList {
    ListNode head;
    public DesignLinkedList() {
        // list=new LinkedList(); 
        head=null;       
    }
    
    public int get(int index) {
       int i=0;
        ListNode temp=head;
        while(temp!=null){
            if((index==i)){
                // Listnode dummy=temp.next;
                // temp.next=new ListNode(val,dummy);
                return temp.val;
            }

            
            i++;
            temp=temp.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        
        head=new ListNode(val,head);
    }
    
    public void addAtTail(int val) {
        if(head==null){
            head=new ListNode(val);
            return;
        }
           ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new ListNode(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
            return;
        }
        int i=0;
        ListNode temp=head;
        // boolean updated=false;
        while(temp!=null&&i<index-1){
            // if(index==i){
            //     ListNode dummy=temp;
            //     temp=new ListNode(val,dummy);
            //     return;
            // }
            // if(temp.next==null){
            //     ListNode dummy=temp.next;
            //     temp=new ListNode(val,dummy);
            //     return;
            // }
            temp=temp.next;
            i++;
        }
        if(temp==null){
            return;
        }
        temp.next=new ListNode(val,temp.next);
        
    }
    
    public void deleteAtIndex(int index) {
        if(head==null)return;
        if(index==0){
            head=head.next;
            return;
        }
        int i=0;
        ListNode temp=head;
        while(temp.next!=null&&index-1>i){
            // if((temp.next!=null&&index-1==i)){
            //     ListNode dummy=temp.next;
            //     temp.next=dummy.next;
            //     return;
            // }else if(temp.next==null){
            //     return;
            // }

            
            i++;
            temp=temp.next;
        }
        if(temp.next==null)return;
        temp.next=temp.next.next;
        // int i=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     if((temp.next!=null&&index-1==i)||temp.next==null){
        //         Listnode dummy=temp.next;
        //         temp.next=new ListNode(val,dummy);
        //         return;
        //     }

            
        //     i++;
        //     temp=temp.next;
        // }
    }
}
class ListNode {
      int val;
      ListNode next;
    //   Listode prev;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    //   ListNode(int val, ListNode next,ListNode prev) { this.val = val; this.next = next;thi.prev=prev; }
}