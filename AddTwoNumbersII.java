import java.util.Stack;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> l1st = new Stack<>();
        Stack<Integer> l2st = new Stack<>();
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while (temp1 != null && temp2 != null) {
            l1st.push(temp1.val);
            l2st.push(temp2.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while (temp1 != null) {
            l1st.push(temp1.val);
            temp1 = temp1.next;
        }

        while (temp2 != null) {

            l2st.push(temp2.val);

            temp2 = temp2.next;
        }
        ListNode dummy = new ListNode(0);
        int bal = 0;
        while (!l1st.isEmpty() && !l2st.isEmpty()) {
            bal += l1st.pop() + l2st.pop();
            ListNode next = dummy.next;

            dummy.next = new ListNode(bal % 10);
            dummy.next.next = next;
            bal /= 10;
        }
        while (!l1st.isEmpty()) {
            bal += l1st.pop();
            ListNode next = dummy.next;
            dummy.next = new ListNode(bal % 10);
            dummy.next.next = next;
            bal /= 10;
        }
        while (!l2st.isEmpty()) {
            bal += l2st.pop();
            ListNode next = dummy.next;
            dummy.next = new ListNode(bal % 10);
            dummy.next.next = next;
            bal /= 10;
        }
        if (bal > 0) {
            ListNode next = dummy.next;
            dummy.next = new ListNode(bal % 10);
            dummy.next.next = next;
        }
        return dummy.next;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}