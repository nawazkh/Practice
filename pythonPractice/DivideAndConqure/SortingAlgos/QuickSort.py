import sys

class QuickSort:
    def __init__(self, givenArray):
        self.givenArray = givenArray

    def solve(self):
        print "In Solve() of QuickSort"
        return self.quicksort_impl(self.givenArray,0,len(self.givenArray)-1)
    
    def quicksort_impl(self,inputArray ,p ,r):
        if p < r:
            q = self.partition(inputArray,p,r)
            self.quicksort_impl(inputArray,p,q-1)
            self.quicksort_impl(inputArray,q+1,r)
        return inputArray

    def partition(self, inputArray, p, r):
        x = inputArray[r]
        i = p - 1
        for j in range(p,r):
            if(inputArray[j] <= x):
                i = i + 1
                temp = inputArray[i]
                inputArray[i] = inputArray[j]
                inputArray[j] = temp
        temp = inputArray[i+1]
        inputArray[i+1] = inputArray[r]
        inputArray[r] = temp
        return i

if __name__ == "__main__":
    inputArray = [6,5,3,4,9,1,8,7,2]
    a = QuickSort(inputArray)
    print a.solve()