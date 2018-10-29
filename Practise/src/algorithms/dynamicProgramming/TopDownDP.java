package algorithms.dynamicProgramming;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TopDownDP {
	public static void main(String args[]) {
		Integer[] priceArray = {1,5,8,9,10,17,17,20,24,30};
		int inputLength = 9;
		int totalRevenue = 0;
		//totalRevenue = cutRod(priceArray,inputLength);
		//totalRevenue = memosied_cut_rod(priceArray,inputLength);
		totalRevenue = bottom_Up_Cut_Rod(priceArray,inputLength);
		System.out.println(totalRevenue);
	}
	
	//--------------------------------//
	public static int memosied_cut_rod(Integer[] priceArray, int inputLength){
		int[] revenueArray = new int[inputLength];
		for (int i = 0; i < inputLength; i++) {
			revenueArray[i]=-1;
		}
		return top_down_memosied_cut_rod(priceArray, inputLength-1, revenueArray);
	}

	public static int top_down_memosied_cut_rod(Integer[] priceArray, int size, int[] revenueArray) {
		int cost = 0;
		if(revenueArray[size]>= 0) {
			return revenueArray[size];
		}
		if(size == 0) {
			return 0;
		}
		else {
			cost = -1;
			for ( int i = 1; i <= size; i++) {
				cost = Math.max(cost, (priceArray[i-1] + top_down_memosied_cut_rod(priceArray,size-i,revenueArray)));
			}
			revenueArray[size] = cost;
		}
		return cost;
	}
	//--------------------------------//
	//--------------------------------//

	private static int bottom_Up_Cut_Rod(Integer[] priceArray, int size) {
		int cost = 0;
		int[] revenueArray = new int[size+1];
		for (int i = 0; i < size; i++) {
			revenueArray[i]=-1;
		}
		revenueArray[0]=0;
		if(size == 0) {
			return 0;
		}
		else {
			for( int i = 1; i <= size; i++) {
				cost = -1;
				for (int j = 1; j <= i; j++) {
					cost = Math.max(cost, (priceArray[j-1] + revenueArray[i-j]));
				}
				revenueArray[i] = cost;
			}
		}
		return cost;
	}

	//--------------------------------//
	
	public static int cutRod(Integer[] priceArray, int size) {
		int revenue = -1;
		if(size == 0) {
			return 0;
		}
		for( int i = 1; i <= size; i++) {
			System.out.println("revenue: "+revenue+", i: "+i);
			revenue = Math.max(revenue, priceArray[i-1] + cutRod(priceArray, size-i));
		}
		return revenue;
	}
}
