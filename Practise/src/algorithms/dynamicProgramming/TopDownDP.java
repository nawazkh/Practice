package algorithms.dynamicProgramming;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TopDownDP {
	private static void main(String args[]) {
		Integer[] priceArray = {1,5,8,9,10,17,17,20,24,30};
		int inputLength = 5;
		int totalRevenue = cutRod(priceArray,inputLength);
	}
	public static int cutRod(Integer[] priceArray, int size) {
		int revenue = -1;
		if(size == 0) {
			return 0;
		}
		for( int i = 0; i < size; i++) {
			System.out.println("revenue : "+revenue+" i "+i);
			revenue = Math.max(revenue, priceArray[i] + cutRod(priceArray, size-i));
		}
		return revenue;
		
	}
}
