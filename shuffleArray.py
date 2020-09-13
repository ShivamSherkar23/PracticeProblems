"""
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

"""

from itertools import zip_longest
def shuffleArray(nums,n):
    arr = []
    brr = []
    for i in range(0,n):
        arr.append(nums[i])
    for j in range(n,len(nums)):
        brr.append(nums[j])
    result = list(zip_longest(arr,brr))
    fl = []
    for sl in result:
        for item in sl:
            fl.append(item)
    return fl

def main():
    nums = [2,5,1,3,4,7]
    n = 3
    result = shuffleArray(nums,n)
    print(result)

if __name__=="__main__":
    main()
    