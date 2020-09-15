"""
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
"""

def smallerNumbersThanCurrent(nums):
        result = []
        counter = 0
        for i in range(len(nums)):
            counter=0
            for j in range(len(nums)):
                if nums[j] < nums[i] and j!=i:
                    counter+=1
            result.append(counter)
        return result 

nums = [8,1,2,2,3]
result = smallerNumbersThanCurrent(nums)
print("solution array",result)        