"""
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

"""

def twoSum(nums, target):
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            out = nums[i] + nums[j]
            if out == target:
                return [i, j]


def main():
    nums = [2, 7, 11, 15]
    target = 9
    result = twoSum(nums, target)
    print('values at following index has sum equal to target ->', result)

if __name__ == "__main__":
    main()
