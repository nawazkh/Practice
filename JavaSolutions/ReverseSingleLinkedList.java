/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode newHead;
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        r(head);
        return newHead;
    }
    public ListNode r(ListNode p){
        ListNode temp = p.next;
        if(temp.next == null){
            temp = p;
            p = p.next;
            p.next=temp;
            temp.next = null;
            // System.out.println(p.val);
            newHead = p;
            return p.next;
        }
        temp = r(p.next);
        // System.out.println("hello: "+temp.val+" "+p.val);
        if(temp.next == null){
            temp = p;
            p = p.next;
            p.next=temp;
            temp.next = null;
        }
        return p.next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        return helper(head);
    }
    public ListNode helper(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}