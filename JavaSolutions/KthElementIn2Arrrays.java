public class KthElementIn2Arrrays {
    public static void main(String args[]) {
        int[] x={2,4,5,7};
        int[] y={0,1,3,6,8};//{0,1,2,3,4,5,6,7,8}
        int k = 2;
        int digit = -1;
        int m = (x.length)/2;
        int n = (y.length)/2;
        System.out.println("x and y lengths: "+x.length+" "+y.length);
        System.out.println("mid points of x and y : "+m+" "+n);
        // k = k - 1;

        while(m+n != k && m >= 0 && n >= 0){
            if(m + n > k){
                if(x[m - 1] < y[n - 1]){
                    n = n/2;
                }
                else{
                    m = m/2;
                }
            }
            else{
                if(x[m - 1] < y[n - 1]){
                    m = (m + x.length - 1)/2;;
                }
                else{
                    n = (n + y.length - 1)/2;
                }
            }
        }

        // while(m1+n1 != k){
        //     if(m1 == 0 && n1 == 0)
        //         break;            
        //     if(m1+n1 > k){
        //         System.out.println("here1 "+x[m1]+" "+y[n1]);
        //         if(m1 > 0 && n1 > 0){
        //             if(x[m1] < y[n1])
        //                 n1 = n1/2;
        //             else if(x[m1] > y[n1])
        //                 m1 = m1/2;
        //         }else if(m1 == 0 && n1 > 0){
        //             n1 = n1/2;
        //             // if(x[m1] < y[n1])
        //             //     n1 = n1/2;
        //             // else if(x[m1] > y[n1])
        //             //     n1 = n1/2;
        //         }else if(m1 > 0 && n1 == 0){
        //             m1 = m1/2;
        //             // if(x[m1] < y[n1])
        //             //     m1 = m1/2;
        //             // else if(x[m1] > y[n1])
        //             //     m1 = m1/2;
        //         }
        //         System.out.println("Hello here 1: "+m1+" "+n1);
        //     }
        //     else{
        //         System.out.println("here2 "+x[m1]+" "+y[n1]);
        //         if(x[m1] < y[n1])
        //             m1 = (m1 + x.length-1)/2;
        //         else if(x[m1] > y[n1])
        //             n1 = (n1 + y.length - 1)/2;
        //         else
        //             m1 = (m1 + x.length-1)/2;
        //         System.out.println("Hello here 2: "+m1+" "+n1);
        //     }           
        // }

        System.out.println(m+" "+n);
            // if(m1+n1 == k && m1 != n1){
            //     if(x[m1] < y[n1])
            //         digit = y[n1];
            //     else if(x[m1] > y[n1])
            //         digit = x[m1];
            // }
            // else
            //     if(x[m1] < y[n1])
            //         digit = x[m1];
            //     else
            //         digit = y[n1];
        
        System.out.println("Digit = " + digit);
    }
}