import sys
class MaxSubArray:
    def __init__(self, shareMarketArray):
        self.shareMarketArray = shareMarketArray
        self.subArray = self.calculateSubArray()
        print "difference array: ", self.subArray

    def calculateSubArray(self):
        subArray = [0]*(len(self.shareMarketArray)-1)
        for i in range(0 , len(subArray)):
            subArray[i] = self.shareMarketArray[i+1] - self.shareMarketArray[i]
        return subArray
    
    def solve(self):
        # call maxsubArray_split()
        print "In solve() of MaxSubArray"
        print self.maxsubArraySplit(self.subArray, 0, (len(self.subArray) - 1))
    
    def maxsubArraySplit(self,inputArray,low,high):
        if (high == low):
            return (low, high, inputArray[low])
        else:
            mid = ((low + high)/2)
            left_low, left_high, left_sum = self.maxsubArraySplit(inputArray,low,mid)
            right_low, right_high, right_sum = self.maxsubArraySplit(inputArray,mid+1,high)
            cross_low, cross_high, cross_sum = self.maxSubArrayLeftRight(inputArray,low,mid,high)

            if ((left_sum >= right_sum) and (left_sum >= cross_sum)):
                # print "returning left"
                return (left_low,left_high,left_sum)
            elif((left_sum <= right_sum) and (right_sum >= cross_sum)):
                # print "returning right"
                return (right_low, right_high, right_sum)
            else:
                # print "returning cross"
                return (cross_low, cross_high, cross_sum)
    
    def maxSubArrayLeftRight(self, inputArray, low, mid, high):
        left_sum = sys.maxint * -1
        left_index = 0
        mySum = 0
        for i in range(mid, low - 1, -1):
            mySum = mySum + inputArray[i]
            if mySum > left_sum:
                left_index = i
                left_sum = mySum
        right_sum = sys.maxint * -1
        right_index = 0 
        mySum = 0
        for i in range(mid + 1, high + 1):
            mySum = mySum + inputArray[i]
            if mySum > right_sum:
                right_index = i
                right_sum = mySum
        return (left_index, right_index, (left_sum + right_sum))

if __name__ == "__main__":
    shareMarketArray = [100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97]
    objMaxSubArray = MaxSubArray(shareMarketArray)
    objMaxSubArray.solve()
    # objMaxSubArray.maxSubArrayLeftRight()