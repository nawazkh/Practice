/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int r = n;
            int p = 1;
            // if(isBadVersion(r)) return r;
            if(isBadVersion(p)) return p;
            int q = returnMid(p,r);
            // System.out.println("q "+q);
            while(p < r){
                // System.out.println("q "+q+" ??"+isBadVersion(q));
                q = returnMid(p,r);
                if(isBadVersion(q)){
                    r = q;
                }else{
                    p = q+1;
                }
                
            }
            return p;
        }
        public int returnMid(int p, int r){
            return (p + (r - p)/2);
        }
    }