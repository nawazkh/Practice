package algorithms.insertionSort;

public class InsertionSort {
	public static void main(String args[]) {
		int[] myArray = {5,2,4,6,1,3};
		//System.out.println(myArray[0]);
		myArray = insertionSort(myArray);
		
	}

	private static int[] insertionSort(int[] myArray) {
		// implement insertion Sort inplace sorting
		for(int j = 1; j < myArray.length; j++) {
			int key = myArray[j];
			int i = j-1;
			while (i >= 0  && myArray[i] > key) {
				if(myArray[i] > key) {
					// put myArray[i] at keys position
					myArray[i+1]=myArray[i];
					i--;
				}
//				System.out.println(myArray[]);
			}
			myArray[i+1]=key;
			printArray(myArray);
//			System.out.println(myArray);
		}
		return myArray;
	}
	private static void printArray(int[] printArray) {
		for (int i = 0 ; i < printArray.length; i++) {
			System.out.print(printArray[i]+", ");
		}
		System.out.print("\n");
	}
	
}
