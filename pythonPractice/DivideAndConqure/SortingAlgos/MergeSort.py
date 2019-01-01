class MergeSort:
    def __init__(self, inputArray):
        self.inputArray = inputArray
    
    def solve(self):
        print "In Solve() of merge sort"
        self.mergeSort(self.inputArray,0,len(self.inputArray)-1)
        return self.inputArray

    def mergeSort(self,inputArray,p,r):
        if(p < r):
            q = (p+r)/2
            # print q
            self.mergeSort(self.inputArray,p,q)
            self.mergeSort(self.inputArray,q+1,r)
            self.merge(self.inputArray,p,q,r)

    def merge(self, givenArray,p,q,r):
        n1 = q - p + 1
        n2 = r - q
        L = [0] * n1
        R = [0] * n2
        # print p, q, r
        for i in range(0, n1):
            L[i] = givenArray[p + i]
        # print L
        for i in range(0, n2):
            R[i] = givenArray[q + i + 1]
        # print R
        
        j = 0
        k = 0

        for i in range(p,r+1):
            if(j < n1 and k < n2 ):
                if(L[j] < R[k]):
                    givenArray[i] = L[j]
                    j += 1
                else:
                    givenArray[i] = R[k]
                    k += 1
            elif(j >= n1 and k < n2):
                givenArray[i] = R[k]
                k += 1
            elif(j < n1 and k >= n2):
                givenArray[i] = L[j]
                j += 1

if __name__ == "__main__":
    inputArray = [5,6,3,4,9,1,8,2,7]
    # InsertionSort, SelectionSort
    a = MergeSort(inputArray)
    # a.merge(inputArray,0,3,6)
    a.solve()
    # print inputArray