class InsertionSort:
    # givenArray = ''
    def __init__(self, givenArray):
        self.givenArray = givenArray
    
    def solve(self):
        print "In solve of Insertion Sort!"
        # print self.givenArray
        return self.insertionSort()
    
    def insertionSort(self):
        print "Starting to sort"
        for i in range(1, len(self.givenArray)):
            key = self.givenArray[i]
            j = i - 1
            while (j >= 0 and key <  self.givenArray[j]):
                self.givenArray[j+1] = self.givenArray[j]
                j -= 1 
            self.givenArray[j + 1] = key
        # print self.givenArray
        return self.givenArray

if __name__ == "__main__":
    inputArray = [6,5,3,4,9,1,8,7,2]
    a = InsertionSort(inputArray)
    outputArray = a.solve()
    print outputArray
    print "Insertion Sort Done!"