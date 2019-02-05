/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        int carry = 0;
        ListNode head = new ListNode(0);
        head.next = null;
        ListNode s = head;
        while(true){
            if(l1 != null && l2 != null){
                int temp = l1.val + l2.val + carry;
                carry = (temp >= 10) ? 1 : 0;
                head.next = new ListNode(temp%10);
                head = head.next;
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1 == null && l2 != null){
                int temp = l2.val + carry;
                carry = (temp >= 10) ? 1 : 0;
                head.next = new ListNode(temp%10);
                head = head.next;
                l2 = l2.next;
            }else if(l2 == null && l1 != null){
                //copy all l1
                int temp = l1.val + carry;
                carry = (temp >= 10) ? 1 : 0;
                head.next = new ListNode(temp%10);
                head = head.next;
                l1 = l1.next;
            }else{
                if(carry == 1){
                    head.next = new ListNode(1);
                    head = head.next;
                }
                head.next = null;
                break;
            }
        }
        return s.next;
    }
}