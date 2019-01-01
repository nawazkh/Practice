from SortingAlgos.InsertionSort import InsertionSort
from SortingAlgos.SelectionSort import SelectionSort
from SortingAlgos.MergeSort import MergeSort
from SortingAlgos.BubbleSort import BubbleSort

class Sorting:
    def __init__(self, algoName, givenArray):
        self.algoName = algoName
        self.givenArray = givenArray
    
    def main(self):
        print "In main method of Sorting Class"
        myProgram = self.algoName(self.givenArray)
        print(myProgram.solve())

if __name__ == "__main__":
    inputArray = [5,6,3,4,9,1,8,2,7]
    # InsertionSort, SelectionSort, MergeSort,BubbleSort
    a = Sorting(BubbleSort, inputArray)
    a.main()
    print "Sorting Done!"