package algorithms.quickSort;

public class QuickSort {
	public static int[] myArray = {5,2,4,6,1,3,7};
	public static void main(String args[]) {
		quickSort(myArray,0,myArray.length-1);
		printArray(myArray);
	}
	private static void quickSort(int[] inputArray, int p, int r) {
		if(p < r) {
			int q = partition(inputArray,p,r);
//			System.out.println(p+" "+q+" "+r);
			quickSort(inputArray, p, q-1);
			quickSort(inputArray, q+1, r);
		}
	}
	private static int partition(int[] inputArray, int p, int r) {
//		printArray(inputArray);
//		System.out.println("----");
		int pivot = inputArray[r];
		int i = p - 1;
		for(int j = p; j < r; j++) {// avoiding last element
			if(inputArray[j] <= pivot) {
				i++;
				int temp = inputArray[i];
				inputArray[i]=inputArray[j];
				inputArray[j]=temp;
			}
		}
		int temp = inputArray[i+1];
		inputArray[i+1] = inputArray[r];
		inputArray[r] = temp;
//		printArray(inputArray);
		return i + 1;
	}
	private static void printArray(int[] printArray) {
		for (int i = 0 ; i < printArray.length; i++) {
			System.out.print(printArray[i]+" ");
		}
		System.out.print("\n");
	}
}
