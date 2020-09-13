"""
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

"""

def runningSum(nums):
        sum=0
        result = []
        for i in range(len(nums)):
            sum = sum + nums[i]
            result.append(sum)
        return result

def main():
    nums = [1,2,3,4]
    result = runningSum(nums)
    print(result)

if __name__ == "__main__":
    main()