import java.util.List;

public class AddTwoNumbers {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);//creating an empty for containing the sum
        ListNode current = res;
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0; //carrying the sum to other


        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }


        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return res.next;
    }
}