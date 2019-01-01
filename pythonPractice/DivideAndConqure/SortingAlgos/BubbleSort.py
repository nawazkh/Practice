class BubbleSort:
    def __init__(self, givenArray):
        self.givenArray = givenArray
    
    def solve(self):
        print "In solve() of Bubble Sort"
        return self.bubbleSort()
        
    
    def bubbleSort(self):
        print "Starting to sort"
        for i in range(0, len(self.givenArray)-2):
            for j in range(len(self.givenArray)-1,i + 1,-1):
                if(self.givenArray[j] < self.givenArray[i]):
                    temp = self.givenArray[j]
                    self.givenArray[j] = self.givenArray[i]
                    self.givenArray[i] = temp
        return self.givenArray

if __name__ == "__main__":
    inputArray = [5,6,3,4,9,1,8,2,7]
    a = BubbleSort(inputArray)
    a.solve()
    print "Sorting Done!"