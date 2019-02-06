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
        Map<RandomListNode, RandomListNode> myMap = new HashMap<RandomListNode, RandomListNode>();
        while(curr != null){
            myMap.put(curr, new RandomListNode(curr.label));
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            myMap.get(curr).next = myMap.get(curr.next);
            myMap.get(curr).random = myMap.get(curr.random);
            curr = curr.next;
        }
        return myMap.get(head);
        
    }
}