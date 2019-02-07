/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    Map<Integer,UndirectedGraphNode> myMap = new HashMap<Integer,UndirectedGraphNode>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return node;
        return clone(node);
    }
    public UndirectedGraphNode clone(UndirectedGraphNode head){
        if(head == null) return null;
        if((myMap.containsKey(head.label)))
            return myMap.get(head.label);
        UndirectedGraphNode temp = new UndirectedGraphNode(head.label);
        myMap.put(temp.label,temp);
        for(UndirectedGraphNode neighbor: head.neighbors){
            temp.neighbors.add(clone(neighbor));
        }
        return temp;
    }
}