class Solution {
    public int trap(int[] height) {
        if(height.length == 0)
            return 0;
        int start = 0, end = height.length - 1, result = 0;
        while (start < end) {
            if (height[start] <= height[end]) {
                int current = height[start];
                System.out.println("hello "+start);
                while (height[++start] < current) {
                    System.out.println(start);
                    result += current - height[start];
                }
            } else {
                int current = height[end];
                while(height[--end] < current) {
                    result += current - height[end];
                }
            }
        }
        return result;
    }
}