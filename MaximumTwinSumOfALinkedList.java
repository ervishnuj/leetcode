class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next;  
        }
        

        ListNode rev = reverse(slow);
        
        ListNode node = head;
        int max = 0; 
        
        
        while (rev != null) {
            int twinSum = node.val + rev.val;
            if (twinSum > max) {
                max = twinSum;
            }
            node = node.next;
            rev = rev.next;
        }
        
        return max;
    }
    
    private ListNode reverse(ListNode node) {
        ListNode res = null;
        while (node != null) {
            ListNode nextNode = node.next;
            node.next = res;
            res = node;
            node = nextNode;
        }
        return res;
    }
}
