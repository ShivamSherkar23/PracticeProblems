"""
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
"""


def restoreString(s, indices):
    result = [""]*len(s)
    for c, i in enumerate(indices):
        result[i] = s[c]
    z = ""
    return z.join(result)


s = "codeleet"
indices = [4, 5, 6, 7, 0, 2, 1, 3]
result = restoreString(s, indices)
print("string after shuffling is", result)
