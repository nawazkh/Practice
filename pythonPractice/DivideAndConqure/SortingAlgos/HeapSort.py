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

    def maximum(self): # call build_max_heap before you call this
        return self.givenArray[0] 

    def heap_extract_max(self):  # call build_max_heap before you call this     
        if self.heapSize < 0:
            return "Heap Underflow"
        max = self.givenArray[0]
        self.givenArray[0] = self.givenArray[self.heapSize - 1]
        self.heapSize = self.heapSize - 1
        self.max_heapify(self.givenArray, 0)
        return max
    
    def heap_increase_key(self, i, key): # call build_max_heap before you call this     
        if key < self.givenArray[i]:
            return "Entered value less than the existing value: ",self.givenArray[i]
        self.givenArray[i] = key
        while (i > 0 and self.givenArray[self.parent(i)] < self.givenArray[i]):
            temp = self.givenArray[i]
            self.givenArray[i] = self.givenArray[self.parent(i)]
            self.givenArray[self.parent(i)] = temp
            i = self.parent(i)
        
    def max_heap_insert(self, key):
        self.heapSize = self.heapSize + 1
        self.givenArray[self.heapSize - 1] = sys.maxint * -1
        self.heap_increase_key(self.heapSize - 1, key)

if __name__ == "__main__":
    inputArray = [6,5,3,4,9,1,8,7,2]
    a = HeapSort(inputArray)
    print a.solve()