/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null && headB == null) return null;
        ListNode l1 = headA;
        ListNode l2 = headB;
        Map<ListNode,Integer> myMap = new HashMap<ListNode, Integer>();
        while(headA != null){
            myMap.put(headA,1);
            headA = headA.next;
        }
        while(headB != null){
            if(myMap.containsKey(headB)){
                return headB;
            }else
                myMap.put(headB,1);
            headB = headB.next;
        }
        return null;
    }
     public ListNode reverse(ListNode head){
       ListNode prev = null;
       ListNode curr = head;
       ListNode next = null;
       while(curr != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       return prev;

   }
}