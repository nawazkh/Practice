xclass SelectionSort:
    def __init__(self, givenArray):
        self.givenArray = givenArray
    
    def solve(self):
        print "In solve() of Selection Sort"
        return self.selectionSort()
        
    def selectionSort(self):
        print "Starting selection sort"
        for i in range(0, len(self.givenArray)):
            key = self.givenArray[i]
            index = i
            for j in range(i,len(self.givenArray)):
                if (key > self.givenArray[j]):
                    key = self.givenArray[j]
                    index = j
            self.givenArray[index] = self.givenArray[i]
            self.givenArray[i] = key
        return self.givenArray

if __name__ == "__main__":
    inputArray = [5,6,3,4,9,1,8,2,7]
    a = SelectionSort(inputArray)
    print a.solve()