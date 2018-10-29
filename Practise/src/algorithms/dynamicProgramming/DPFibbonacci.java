package algorithms.dynamicProgramming;

public class DPFibbonacci {
	public static void main(String[] argv) {
		int n_index = 9;
		int value = dpFibbonacciCompute(n_index);
		System.out.println(value);
	}

	private static int dpFibbonacciCompute(int n_index) {
		int[] myArray = new int[n_index];
		int currVal = 0;
		if(n_index == 1) {
			return 0; 
		}
		else if(n_index == 2) {
			return 1;
		}
		else {
			myArray[0]=0;
			myArray[1]=1;
			//System.out.println(myArray[0]+" 1");
			//System.out.println(myArray[1]+" 2");
			for(int i = 2; i < n_index; i++) {
				myArray[i] = myArray[i-1]+myArray[i-2];
				//System.out.println(myArray[i]+" "+(i+1));
				
			}
		}
		return myArray[n_index-1];
	}
}
