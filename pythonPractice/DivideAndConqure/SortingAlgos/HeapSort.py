import sys
class HeapSort:
    def __init__(self, givenArray):
        self.givenArray = givenArray
        self.heapSize = 0

    def solve(self):
        print "In Solve() of HeapSort!"
        return self.heapsort()
    
    def parent(self,index):
        return index/2

    def left(self, index):
        return 2*(index)
    
    def right(self, index):
        return (2*(index)) + 1

    def max_heapify(self, inputArray, i):
        l = self.left(i)
        r = self.right(i)
        largest = sys.maxint * -1
        if(l < self.heapSize and inputArray[l] > inputArray[i]):
            largest = l
        else:
            largest = i

        if(r < self.heapSize and inputArray[r] > inputArray[largest]):
            largest = r

        if largest != i:
            temp = inputArray[i]
            inputArray[i] = inputArray[largest]
            inputArray[largest] = temp
            self.max_heapify(inputArray,largest)

    def build_max_heap(self, inputArray):
        self.heapSize = len(inputArray)
        for i in range(len(inputArray)/2, -1, -1): # because the leaf nodes lie in the array from len(inputArray)/2
            self.max_heapify(inputArray,i)

    def heapsort(self):
        self.build_max_heap(self.givenArray)
        # print self.givenArray
        for i in range(len(self.givenArray)-1, -1, -1):
            temp = self.givenArray[0]
            self.givenArray[0] = self.givenArray[i]
            self.givenArray[i] = temp
            self.heapSize = self.heapSize - 1
            self.max_heapify(self.givenArray, 0)
        return self.givenArray
        

if __name__ == "__main__":
    inputArray = [6,5,3,4,9,1,8,7,2]
    a = HeapSort(inputArray)
    print a.solve()