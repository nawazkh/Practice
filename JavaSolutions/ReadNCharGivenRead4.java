/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf);
 */
public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        if(n == 0) return 0;
        
        char[] buf4 = new char[4];
        int count = 0;
        while(n > 0){
            int readCount = read4(buf4);
            for(int i = 1; i <= Math.min(readCount, n); i++){
                // System.out.println(buf4[i-1]);
                buf[count++] = buf4[i-1];
            } 
            // System.out.println(n);
            n = n - 4;
        }
        return count;
    }
}