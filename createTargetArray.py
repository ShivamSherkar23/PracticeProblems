"""
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
"""

def createTargetArray(nums,index):
        target = []*len(nums)
        for i in range(0,len(nums)):
            target.insert(index[i],nums[i])
        return target
nums = [0,1,2,3,4]
index = [0,1,2,2,1]   
result = createTargetArray(nums,index)
print('target array:',result)     