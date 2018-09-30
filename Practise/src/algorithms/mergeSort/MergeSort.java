package algorithms.mergeSort;

public class MergeSort {
	public static void main(String args[]) {
		int[] myArray = {5,2,4,6,1,3};
//		System.out.println((5/2));
		mergeSort(myArray,0,myArray.length-1);
		printArray(myArray);
	}

	private static void mergeSort(int[] myArray, int p, int r) {
		if(p < r ){
			int q = (p+r)/2;
//			System.out.println(p+" "+q+" "+r);
			//			System.out.println("here1");
			mergeSort(myArray, p, q);
//			System.out.println("here2");
			mergeSort(myArray, q+1, r);
			//			System.out.println("here3");
			//			System.out.println(p+" "+q+" "+r);
			mergeSort_Impl(myArray,p,q,r);
			//			System.out.println("here4");
		}
	}

	private static void mergeSort_Impl(int[] myArray, int p, int q, int r) {
		//create two arrays
		int n1 = (q-p+1);
		int n2 = (r-q);
		int[] left = new int[n1];
		int[] right = new int[n2];
//		System.out.println(";;;"+p+" "+q+" "+r);
		for(int i = 0; i < n1; i++ ) {
//			System.out.println(myArray[p+i]);
//			System.out.println(left[i]);
			left[i] = myArray[p+i];			
		}
		
		for(int i = 0; i < n2; i++ ) {
			right[i] = myArray[q+i+1];			
		}
		int i = 0;
		int j = 0;
//		System.out.println(left[i]+" "+right[j]);
		for(int k = p; k <= r; k++) {
//			System.out.println("k"+k);
			if(i < n1 && j < n2) {
				if(left[i] < right[j]) {
					myArray[k]=left[i];
					i++;
				}
				else {
					myArray[k]=right[j];
					j++;
				}
			}
			else if(i >= n1 && j < n2) {
				myArray[k]=right[j];
				j++;
			}
			else if(i < n1 && j >= n2) {
				myArray[k]=left[i];
				i++;
			}
			
		}

	}
	private static void printArray(int[] printArray) {
		for (int i = 0 ; i < printArray.length; i++) {
			System.out.print(printArray[i]+" ");
		}
		System.out.print("\n");
	}
}
