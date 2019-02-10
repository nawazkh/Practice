class Solution {
    Set<Integer> enteredRooms = new HashSet<Integer>();
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if(rooms == null) return false;
        helper(rooms, 0);
        return enteredRooms.size() == rooms.size();
    }
    public void helper(List<List<Integer>> rooms, Integer roomId){
        enteredRooms.add(roomId);
        List<Integer> keysInRoom = rooms.get(roomId);
        for(Integer key: keysInRoom){
            if(!enteredRooms.contains(key))
                helper(rooms,key);
        }
    }
}