import sys

class MaxSubArrayLinear:
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
        # find the max subArray first
        current_sum,max_sum = 0, 0
        start_day, end_day = 0, 0
        is_reset = True
        for i in range(0, len(self.subArray)):
            current_sum = current_sum + self.subArray[i]
            if(max_sum < current_sum):
                max_sum = current_sum
                end_day = i
                if(is_reset):
                    start_day = i
                    is_reset = False

            if(current_sum < 0):
                is_reset = True
                # change the start day
                current_sum = 0
        
        return (start_day, end_day, max_sum)

if __name__ == "__main__":
    # shareMarketArray = [100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97]
    shareMarketArray = [7,1,5,3,6,4]
    objMaxSubArrayLinear = MaxSubArrayLinear(shareMarketArray)
    print objMaxSubArrayLinear.solve()