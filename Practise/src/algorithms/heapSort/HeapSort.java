package algorithms.heapSort;

public class HeapSort {
	static int arrayLength = 0;
	static int heapLength = 0;
	static int[] myArray = {5,2,4,6,1,3,7};
	public static void main(String args[]) {
		
		arrayLength = myArray.length;
		heapLength = myArray.length;
//		printArray(myArray);
		heap_Sort(myArray);
		printArray(myArray);
		
	}
	//PARENT
	public static int returnParent(int i) {
		return (i%2 == 0)? ((i/2)-1) : i/2;
	}
	//LEFT
	public static int returnLeft(int i) {
		return (2*i) + 1;
	}//RIGHT
	public static int returnRight(int i) {
		return (2*i) + 2;
	}
	// builds an heap using the input index in O(log n) time
	//assumes that left and right of the elements are already a max heap
	// starts with checking the input is a max element are not
	public static void max_Heapify(int[] inputArray, int i) {
//		System.out.println("in max_Heapify");
		int l = returnLeft(i);
		int r = returnRight(i);
		int largest = 0;
//		System.out.println(l+" "+r+" "+inputArray[l]+" "+inputArray[i]);
		if(l < heapLength && inputArray[l] > inputArray[i]) {
			largest = l;
		}
		else {
			largest = i;
		}
		if(r < heapLength && inputArray[r] > inputArray[largest]) {
			largest = r;
		}
		if(largest != i) {
			int temp = inputArray[i];
			inputArray[i]=inputArray[largest];
			inputArray[largest] = temp;
			max_Heapify(inputArray, largest);
		}
	}
	public static void build_Max_Heap(int[] inputArray) {
		arrayLength = heapLength;
//		System.out.println("in build max");
//		heapLength = inputArray.length;
		// Since leaf nodes are in the last 
		for(int i = (inputArray.length/2)-1; i >= 0; i--) {
			max_Heapify(inputArray, i);
		}
	}
	public static void heap_Sort(int[] inputArray) {
//		int[] finalArray = new int[inputArray.length];
//		System.out.println("in heap_Sort");
		build_Max_Heap(inputArray);
//		printArray(inputArray);
//		System.out.println("build_Max_Heap done");
		int temp = 0;
		for(int i = inputArray.length-1; i >= 1; i --) {
			temp = inputArray[i];
			inputArray[i]=inputArray[0];
			inputArray[0]=temp;
			heapLength = heapLength - 1;
			max_Heapify(inputArray, 0);
		}		
	}
	private static void printArray(int[] printArray) {
		for (int i = 0 ; i < printArray.length; i++) {
			System.out.print(printArray[i]+" ");
		}
		System.out.print("\n");
	}
}
