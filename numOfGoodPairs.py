"""

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

"""
def numIdenticalPairs(nums):
        counter = 0
        for i in range(0,len(nums)):
            for j in range(len(nums)):
                if nums[i] == nums[j] and i<j:
                    counter+=1
        return counter

def main():
    nums = [1,2,3,1,1,3]
    result = numIdenticalPairs(nums)
    print("no of identical pairs", result)

if __name__=="__main__":
    main()
