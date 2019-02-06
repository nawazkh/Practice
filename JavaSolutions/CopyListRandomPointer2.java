/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;
        RandomListNode curr = head;
        //created 
        while(curr != null){
            RandomListNode temp = new RandomListNode(curr.label);
            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;
        }
        
        curr = head;
        while(curr != null){
            curr.next.random = (curr.random == null)? null : curr.random.next;
            curr = curr.next.next;
        }
        
        curr = head;
        RandomListNode temp = curr.next, s = curr.next;
        while(curr != null){
            curr.next = temp.next;
            temp.next = (curr.next == null) ? null : curr.next.next;
            curr = curr.next;
            temp = temp.next;
        }
        return s;
    }
}